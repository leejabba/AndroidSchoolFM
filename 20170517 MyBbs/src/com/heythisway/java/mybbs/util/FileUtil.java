package com.heythisway.java.mybbs.util;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	public static void makeDirectoryIfNotExist(String dirPath){
		File dir = new File(dirPath);
		if(!dir.exists()){
			dir.mkdirs();	//검사한 경로상의 모든 디렉토리를 생성해준다.
		}
	}
	
	public static File getFile(String path){
//		1.1. 파일이 있는지 검사하고
		File database = new File(path);
		// 	1.2 없으면 생성
		if(!database.exists()){
		try {
				database.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
		}
		
	}
		return database;
}
	
	private static File makeFile(File database){
		try {
			database.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return database;
		
	}
}
