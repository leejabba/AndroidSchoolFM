package com.heythisway.java.fibonacci;

public class FibonacciT {
	//강사님 버전
	
	public int[] process(int n){
		
		int result[] = new int[100];
		
		//초기값 설정 - 난 너무 배열에만 목을 맸구나. 유연성 있게 생각하자
		int a = 0;
		result[0] = a;
		
		int b = 1;
		result[0] = b;

		int result_index = 2;

		for(int i = 0 ; i < n-2 ; i++){
			int c = a + b;
			result[result_index] = c;
			result_index = result_index + 1;
			a = b;
			b = c;
			
		}
		
		return result;
		
	}
	
}
