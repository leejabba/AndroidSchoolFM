package com.heythisway.java.mybbs.view;

import com.heythisway.java.mybbs.model.Bbs;

public class BbsDetail {

	public void showNo(long id){
		System.out.println("글번호 : " + id);
	}
	
	public void showTitle(String title){
		System.out.println("제목 : " + title);
	}
	
	public void showAuthor(String author){
		System.out.println("글쓴이 : " + author);
	}
	
	public void showDate(String date){
		System.out.println("날짜 : " + date);
	}
	
	public void showView(String view){
		System.out.println("조회수 : " + view);
	}
	
	public void showContent(String content){
		System.out.println("내용 : " + content); 
	}
	
	public void showView(int view){
		System.out.println("조회수 : " + view);
	}
	
	public void endDetail(){
		System.out.println("");		
	}
	
}
