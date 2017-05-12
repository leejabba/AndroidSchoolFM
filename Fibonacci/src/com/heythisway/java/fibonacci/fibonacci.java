package com.heythisway.java.fibonacci;

public class fibonacci {

	//생성자
	public fibonacci(){
		System.out.println("이자빠가 만든 배열을 이용한 피보나치수열을 \n산출하는 클래스가 호출되었습니다.\n");
	}
	
	
	public void printFibonacci(int n){
		//이자빠 버전

		
		//n값의 크기만큼 배열을 할당
		int arrayN[] = new int[n];
		
		//배열의 크기를 추출하는 변수
		int arrayN_length = arrayN.length;
		
		//입력받은 n값을 출력
		System.out.println("> 입력받은 n의 값 : " + n);
		
		//n값의 크기에 따른 변수 값 설정 & 값 출력
		if (n == 0) {
			System.out.println("> 알림 : 0 이상의 숫자를 입력해주세요!");
		} else if (n == 1) {
			arrayN[0] = 0;
			System.out.println(arrayN[0]);
		} else if (n > 1) {
			arrayN[0] = 0;
			arrayN[1] = 1;
			System.out.println(arrayN[0]);
			System.out.println(arrayN[1]);
			if (n > 3){
				for (int i = 2 ; i < arrayN_length ; i++){
					arrayN[i] = arrayN[i-1] + arrayN[i-2];
					System.out.println(arrayN[i]);
				}
			}
		} 
	}
}		
