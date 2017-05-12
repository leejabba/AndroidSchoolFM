package com.yj.java.board;

import java.util.ArrayList;
import java.util.Scanner;

public class boardMain {

	public static void main(String[] args) {
		boolean Status = true;
		
		ArrayList<boardDTO> datas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while(Status){
			boardDTO bdt = new boardDTO();
			String n;
			System.out.println("---------------------");
			System.out.println("명령어를 입력하세요. ");
			System.out.println("1.입력");
			System.out.println("2.목록");
			System.out.println("3.상세보기");
			System.out.println("4.삭제");
			System.out.println("5.검색");
			System.out.println("6.종료");
			System.out.println("---------------------");
			
			n = scanner.nextLine();
			
			switch(Integer.parseInt(n)){
			case 1 :
				System.out.println("----입력하기-----");
				
				System.out.println("제목을 입력 : ");
				bdt.title = scanner.nextLine();
				
				System.out.println("저자를 입력 : ");
				bdt.author = scanner.nextLine();
				
				System.out.println("내용을 입력 : ");
				bdt.content = scanner.nextLine();
				
				bdt.initDate();
				
				datas.add(bdt);
				break;
			
			case 2:
				System.out.println("--------목록보기---------");
				for( boardDTO item : datas) {
					System.out.println("저자 : " + item.author);
					System.out.println("제목 : " + item.title);
					System.out.println();
				}
				break;
			case 3:
				System.out.println("---------상세보기---------");
				for(boardDTO item : datas) {
					System.out.println("저자 : " + item.author);
					System.out.println("제목 : " + item.title);
					System.out.println("내용 : " + item.content);
					System.out.println("날짜 : " + item.date);
					System.out.println();
				}
				break;
			case 4:
				System.out.println("---------삭제하기------------");
				System.out.println("삭제할 책의 이름을 입력 : ");
				String TargetTitle = scanner.nextLine();
				int size = datas.size();
				for(int i = 0 ; i < size ; i++ ) {
					boardDTO dt = datas.get(i);
					if(TargetTitle.equals(dt.title)){
						datas.remove(i);
					}
				}
				break;
			case 5: 
				System.out.println("---------검색하기------------");
				System.out.println("검색할 책의 이름을 입력 : ");
				String TargetTitle2 = scanner.nextLine();
				int size2 = datas.size();
				for(int i = 0 ; i < size2 ; i++ ) {
					boardDTO dt = datas.get(i);
					if(TargetTitle2.equals(dt.title)){
						System.out.println("저자 : " + dt.author);
						System.out.println("제목 : " + dt.title);
						System.out.println("내용 : " + dt.content);
						System.out.println("날짜 : " + dt.date);
					}
				}
				break;

			case 6: 
				Status = false;
				break;
				
		   default : 
			   System.out.println("잘못된입력");
			   break;
				}
			
			}
		
		}
	}

