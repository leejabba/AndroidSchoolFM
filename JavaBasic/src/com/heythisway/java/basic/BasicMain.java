package com.heythisway.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

import com.heythisway.java.basic.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {
		
		//Bbs datas[] = new Bbs[100];
		ArrayList<Bbs> datas = new ArrayList<>();
		
		//스캐너를 사용함
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("명령어를 입력하세요 : 1.입력, 2.목록, 3.상세보기");
			String command = scanner.nextLine();
			String command3 = new String();
			int command3Num;
			String command3Del = new String();
			
			// 입력 파트
			if(command.equals("1")){
				Bbs bbs = new Bbs();
				System.out.println("제목을 입력하세요:");
				bbs.title = scanner.nextLine();	// 입력이 들어올때까지 여기서 시스템이 대기한다.
				
				System.out.println("이름을 입력하세요:");
				bbs.author = scanner.nextLine();
					
				System.out.println("내용을 입력하세요:");
				bbs.content = scanner.nextLine();
				
				bbs.initDate();
					
				datas.add(bbs);
				
			// 목록 보기 파트
			}else if(command.equals("2")){			
				int dataNum = 1;
				System.out.println("----- 입력 결과 -----");
				for(Bbs item : datas){
					System.out.print(dataNum);
					System.out.print("   ");
					System.out.print("제목 : " + item.title);
					System.out.print("   ");
					System.out.print("날짜 : " + item.date);
					System.out.println("");
					
					dataNum = dataNum + 1;
				}
				System.out.println("");
				
			// 상세보기 파트
			}else if(command.equals("3")){
				while(true){
					System.out.println("현재 " + datas.size() + "개의 글이 있습니다.");
					System.out.println("몇 번째 글을 확인하고 싶으세요?");
					command3 = scanner.nextLine();
					command3Num = Integer.parseInt(command3);	// 입력받은 숫자를 문자에서 정수로 변환
					// 목록에 없는 것을 요구하면 오류 알리고 리턴하기
					if (command3Num <= datas.size()){
						// 인덱스에서 찾기
						Bbs bbs = datas.get(command3Num - 1); 
						System.out.println("----- 상세 내용 확인 -----");
						System.out.println("제목 : " + bbs.title);
						System.out.println("작가명 : " + bbs.author);
						System.out.println("내용 : " + bbs.content);
						System.out.println("");
						
						// 상세 내용 확인한 문서 삭제 여부 확인
						System.out.println("이 문서를 삭제하시겠습니까?");
						System.out.println("1. 삭제, 2. 취소");
						command3Del = scanner.nextLine();
						int command3DelNum = Integer.parseInt(command3Del);
						System.out.println("");
						
						if (command3DelNum == 1){
							datas.remove(command3Num - 1);
						}
						break;
					} else {
						System.out.println("목록에 없는 글을 선택하셨습니다. 다시 선택하세요.");
						System.out.println("");
					}
				}				
			}
		}		
	}
}


