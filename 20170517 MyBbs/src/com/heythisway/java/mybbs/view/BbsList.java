package com.heythisway.java.mybbs.view;

import java.util.ArrayList;

import com.heythisway.java.mybbs.model.Bbs;

public class BbsList {
	
	
	//목록 뿌리기
	public void showList(ArrayList<Bbs> datas){
		//System.out.println("번호|  제목  |  글쓴이  |        날짜       |  조회수");
		for(Bbs bbs : datas){
			System.out.print(bbs.getId()+"  |  ");
			System.out.print(bbs.getTitle()+"  |  ");
			System.out.print(bbs.getAuthor()+"  |  ");
			System.out.print(bbs.getDate()+"  |  ");
			System.out.println(bbs.getView()+"");
		}
	}

	//쓰기로 이동
	public void goInput(){
		
	}
	
	
	//검색
	public void search(String word){
		
	}
	
	//삭제하기
	public void delete(long id){
		
	}
}
