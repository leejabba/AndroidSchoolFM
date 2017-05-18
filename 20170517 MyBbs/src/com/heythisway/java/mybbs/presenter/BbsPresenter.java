package com.heythisway.java.mybbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.heythisway.java.mybbs.model.Bbs;
import com.heythisway.java.mybbs.model.BbsLoader;
import com.heythisway.java.mybbs.view.BbsDetail;
import com.heythisway.java.mybbs.view.BbsInput;
import com.heythisway.java.mybbs.view.BbsList;

public class BbsPresenter {
	//코드의 가독성을 높이기 위해 상수를 사용
	final boolean START = true;
	final boolean FINISH = false;
	boolean runFlag = START;
	
	//데이터 임시 저장소
	ArrayList<Bbs> datas;
	
	Scanner scanner;
	BbsInput input;
	BbsList list;
	BbsDetail detail;
	BbsLoader loader;
	
	//글번호를 저장하는 전역변수
	int number = 0;
	int viewCount = 0;
	
	/**
	 * new 생성자가 호출되면 init() 함수를 통해 초기화해준다.
	 */
	public BbsPresenter(){
		init();
	}
	
	/**
	 * 초기화 함수, 사용할 객체들을 미리 메모리에 로드해둔다.
	 */
	private void init(){
		scanner = new Scanner(System.in);
		input = new BbsInput();
		datas = new ArrayList<Bbs>();
		list = new BbsList();
		detail = new BbsDetail();
		loader = new BbsLoader();
	}
	
	public void start(){

		while(runFlag){
			System.out.println("명령어를 입력하세요 [ 1:목록, 2:쓰기, 3:상세보기 ]");
			String command = scanner.nextLine();
			switch(command){
			case "1" : 
				datas = loader.read();
				list.showList(datas);
				break;
			case "2" :
				write();
				break;
			case "3" :
				goDetail();
				break;
			}
		}
	}
	
	public void write(){
		Bbs bbs = input.process(scanner);
		
		//글 번호 증가
		number = number + 1;
		
		bbs.setId(number);
		bbs.setDate(getDate());
		
		loader.write(bbs);
		datas.add(bbs);
	}
	
	//날짜를 가져오는 메소드
	private String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		return sdf.format(System.currentTimeMillis());
	}
	
	//상세보기로 이동
	public void goDetail(){
		System.out.println("글번호를 입력하세요: ");
		String temp = scanner.nextLine();
		long id = Long.parseLong(temp);
		
		viewCount = viewCount + 1;
		
		for(Bbs bbs : datas){
			if(bbs.getId() == id){
				//조회수 늘리기
				viewCount = bbs.getView() + 1;
				bbs.setView(viewCount);
				
				detail.showNo(bbs.getId());
				detail.showTitle(bbs.getTitle());
				detail.showAuthor(bbs.getAuthor());
				detail.showDate(bbs.getDate());
				detail.showContent(bbs.getContent());
				detail.showView(bbs.getView());
				detail.endDetail();
				break;	//조건문에 부합되면 반복문을 중지한다.
			}
		}
	}
	
	public void end(){
		runFlag = FINISH;
	}
}
