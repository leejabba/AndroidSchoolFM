package com.heythisway.java.mybbs.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.heythisway.java.mybbs.util.FileUtil;

public class BbsLoader {
	// 파일 이름 변수 선언
	final String DATABASE_DIR = "/Users/SMARTHINK_MBL13/workspace/";
	final String DATABASE_NAME = "mybbs.db";
	final String COLUMNG_SEPERATOR = "@@"; // 한칸 단위
	final String RECORD_SEPERATOR = "\r\n"; // 한줄 단위
	final int DATABASE_COUNT = 0;

	/**
	 * 저장소에서 데이터를 읽어옴
	 * 
	 * @return
	 */
	public ArrayList<Bbs> read() {
		ArrayList<Bbs> result = new ArrayList<Bbs>();

		// 1. 파일 존재 유무 검사
		File database = new File(DATABASE_DIR + DATABASE_NAME);
		if (!database.exists()) {
			/*
			 * 2. 있으면 파일을 읽어서 줄단위로 Bbs에 저장하고 완성된 Bbs를 result에 add한다.
			 */
			// 2.1. BufferedReader로 밥주걱 단위로 데이터를 읽을 준비를 한다.

			try {
				BufferedReader br = new BufferedReader(database);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String temp = "";
			// 줄 단위로 파일을 읽어와서 변수에 저장
			while ((temp = br.readLine()) != null) {
				String bbsTemp[] = temp.split(COLUMNG_SEPERATOR);
				// Bbs에 담고
				Bbs bbs = new Bbs();
				bbs.setId(Long.parseLong(bbsTemp[0]));
				bbs.setTitle(bbsTemp[1]);
				bbs.setAuthor(bbsTemp[2]);
				bbs.setDate(bbsTemp[3]);
				bbs.setView(Integer.parseInt(bbsTemp[4]));
				bbs.setContent(bbsTemp[5]);

				// 완성된 Bbs를 result에 add한다. (반복)
				result.add(bbs);
			}

		}
		return result;
	}

	/**
	 * 저장소에 데이터를 저장
	 * 
	 * @param bbs
	 */
	public void write(Bbs bbs) {

		// bbs에 있는 데이터를 텍스트 파일에 저장한다.
		// 1. 디렉토리가 있는지 검사한다.
		FileUtil.makeDirectoryIfNotExist(DATABASE_DIR);

		// 1.1. 파일이 있는지 검사하고
		FileUtil.getFile(DATABASE_DIR + DATABASE_NAME);

		// 2. bbs에 내용을 database 파일에 저장 한다.
		// 2.1. 먼저 저장하는 데이터의 구조를 설계해야 한다.
		// 2.1.1. 구분자를 정의한다.

		// 2.2 bbs의 내용을 횡으로 펼친다.
		String oneData = bbs.getId() + COLUMNG_SEPERATOR + bbs.getTitle() + COLUMNG_SEPERATOR + bbs.getAuthor()
				+ COLUMNG_SEPERATOR + bbs.getDate() + COLUMNG_SEPERATOR + bbs.getView() + COLUMNG_SEPERATOR
				+ bbs.getContent() + RECORD_SEPERATOR;

		// 3. 횡의로 펼쳐진 데이터를 파일의 제일 마지막줄에 저장한다.
		// 3.1. FileWriter 객체를 사용해서 기존 데이터에 계속 더해쓴다.
		Path path = Paths.get(DATABASE_DIR, DATABASE_NAME);
		try {
			String database = null;
			// 두번째 인자가 append를 허용할 것인지 결정
			FileWriter writer = new FileWriter(database, true);
			writer.append(oneData);

			/*
			 * I/O 처리가 일어나는 과정에서는 과정이 끝나면 반드시 닫아야 한다. 닫지 않으면 자원소모가 너무 심해 나중엔 시스템
			 * 다운이 생기기도 한다.
			 */
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public long readCount() {
		long result = 0;
		// 1. 위와마찬가지로 디렉토리와 파일이 있는지 검사하고 없으면 먼저 생성해준다
		FileUtil.makeDirectoryIfNotExist(DATABASE_DIR);
		File database = FileUtil.getFile(DATABASE_DIR + DATABASE_COUNT);

		try {
			// 1. 읽기 위한 빨대 꼽기
			FileReader fr = new FileReader(database);
			// 2. 굵은 빨대
			BufferedReader br = new BufferedReader(fr);
			// 3. 한줄만 읽어오기
			String number = br.readLine();

			// 로직
			// 4. 읽어온 데이터에 아무것도 없으면 첫번째 글이므로 result에 1을 셋팅
			if (number == null) {
				result = 1;
				// 5. 데이터가 있으면 숫자로 변환하고 +1을 해서 result에 셋팅
			} else {
				long tempNumber = Long.parseLong(number);
				result = tempNumber + 1;
			}
			fr.close();

			// 6. 데이터베이스에 최종 카운터를 저장한다.
			FileWriter fw = new FileWriter(database);
			fw.write(result + "");
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	private void makeDirectoryIfNotExist() {
		File dir = new File(DATABASE_DIR);
		if (!dir.exists()) {
			dir.mkdirs(); // 검사한 경로상의 모든 디렉토리를 생성해준다.
		}
	}

	private File getFile(String path) {
		// 1.1. 파일이 있는지 검사하고
		File database = new File(path);
		// 1.2 없으면 생성
		if (!database.exists()) {
			try {
				database.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return database;
	}

	private File makeFile(File database) {
		try {
			database.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return database;

	}
}
