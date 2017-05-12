/*
 * String 문자와 정수형 숫자를 입력받아
 * 패턴에 맞도록 출력해주는 프로그램입니다.
 * 
 * 난이도 3번과 3.8번은 비슷한 패턴인데
 * 3번은 스스로가 만든 코드이고, 3.8번은 강사님의 팁을
 * 이용해 완성시킨 코드입니다.
 * 
 */

package com.heythisway.java.draw;

public class DrawMain {

	public static void main(String[] args) {
		// 난이도 1
		DrawMain draw = new DrawMain();
		draw.drawRect1("A", 5);
		
		// 난이도 2
		draw.drawRect2("A", 5);
		
		// 난이도 3
		draw.drawRect3("A", 5);
		
		// 난이도 3.5
		draw.drawRect35("A", 5);		
		
		// 난이도 3.6
		draw.drawRect36("A", 5);
		
		// 난이도 3.8
		draw.drawRect38("A", 5);
		
		// 난이도 4
		draw.drawRect4("A", 5);

	}

	
	// 4. 난이도
	public void drawRect4(String mark, int count){
		int countA = 0;
		
		System.out.println("난이도 4 \n");
		
		for (int i = 0 ; i < count ; i++){
			countA = countA + 1;
			for (int j = 0 ; j < count ; j++){
				System.out.print(" ");
				if (j >= count-countA) {
					System.out.print(mark);
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	
	// 3.8 난이도
	public void drawRect38(String mark, int count){
		System.out.println("난이도 3.8 \n");
		
		// 각 줄단위를 처리하는 for문 (상단)	
		for (int i=0 ; i<count ; i++){
			// 공백을 처리하는 반복문
			for (int j=1 ; j<count-i ; j++){
				System.out.print(" ");
			}
			
			// 마크를 출력하는 반복문
			for (int k=0 ; k<=i*2 ; k++){
				System.out.print(mark);
			}
			System.out.println("");
		}
		
		// 각 줄단위를 처리하는 for문 (하단)
		for (int i=count-2 ; i>=0 ; i--){
			
			//공백을 처리하는 반복
			for (int j=1 ; j<count-i ; j++){
				System.out.print(" ");
			}
			
			// 마크를 출력하는 부분
			for (int k=i*2 ; k>=0 ; k--){
				System.out.print(mark);
			}
			
			System.out.println("");
		}
		System.out.println("");
	}
	
	
	// 3.6 난이도 
			public void drawRect36(String mark, int count){
				int countA = 1;	//출력하는 개수
				int countB = 0;	//세로줄 개수 카운트
				
				System.out.println("난이도 3.6 \n");
				
				for (int i = 0 ; i < count ; i++){
					countB = countB + 1;
					for (int j = 0 ; j < count ; j++){
						if (j < count-countB){
							System.out.print(" ");
						}else if (j >= count-countB) {
							System.out.print(mark);
							if (i != 0) {
								if (i == count-1) {
									for (int h=0 ; h < countA-1 ; h++){
										System.out.print(mark);
									}
									break;
								}
								for (int m=0; m<=countA-2; m++){
									if (m < countA-2) {
										System.out.print(" ");
									}else if (m == countA-2){
										System.out.print(mark);
									}
								}	
							}
							break;
						}
					}
					System.out.println("");
					countA = countA + 2;
				}
				System.out.println("");
			}
		
	
	// 3.5 난이도 
		public void drawRect35(String mark, int count){
			int countA = 1;	//출력하는 개수
			int countB = 0;	//세로줄 개수 카운트
			
			System.out.println("난이도 3.5 \n");
			
			for (int i = 0 ; i < count ; i++){
				countB = countB + 1;
				for (int j = 0 ; j < count ; j++){
					if (j < count-countB){
						System.out.print(" ");
					}else if (j >= count-countB) {
						System.out.print(mark);
						if (i != 0) {
							for (int m=0; m<=countA-2; m++){
								if (m < countA-2) {
									System.out.print(" ");
								}else if (m == countA-2){
									System.out.print(mark);
								}
							}	
						}
						break;
					}
				}
				System.out.println("");
				countA = countA + 2;
			}
			System.out.println("");
		}
	
	
	// 3. 난이도 
		public void drawRect3(String mark, int count){
			int countA = 1;
			int countB = 0;
			
			System.out.println("난이도 3 \n");
			
			for (int i = 0 ; i < count ; i++){
				countB = countB + 1;
				for (int j = 0 ; j < count ; j++){
					if (j < count-countB){
						System.out.print(" ");
					}else if (j >= count-countB) {
						for (int m=0 ; m<countA ; m++){
							System.out.print(mark);
						}
						break;
					}
				}
				System.out.println("");
				countA = countA + 2;
			}
			System.out.println("");
		}
	
	
	// 2. 난이도
		public void drawRect2(String mark, int count){
			int countA = 0;
			
			System.out.println("난이도 2 \n");
			
			for (int i = count ; i > 0 ; i--){
				countA = countA + 1;
				for (int j = 0 ; j < count ; j++){
					if (j < count-countA) {
					System.out.print(" ");
					} else {
						System.out.print(mark);
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	
	// 1. 입력받은 문자 한개를 세로 개수를 지정해서 출력하시오.
	public void drawRect1(String mark, int count){
		System.out.println("난이도 1 \n");
		for (int i = 0 ; i < count ; i++){
			for (int j = 0 ; j <= i ; j++){
				System.out.print(mark);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
}
