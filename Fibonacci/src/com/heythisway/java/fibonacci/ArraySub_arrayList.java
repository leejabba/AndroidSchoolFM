package com.heythisway.java.fibonacci;

import java.util.ArrayList;

public class ArraySub_arrayList {
	
	public ArraySub_arrayList() {
		System.out.println("강사님이 만든 컬렉션을 이용한 피보나치수열을 \n산출하는 클래스가 호출되었습니다.\n");
	}
	
		//강사님 버전
		//컬렉션 객체 배열 기법 사용
	int a;
		
	public ArrayList<Integer> process(int n){
			
		ArrayList<Integer> result = new ArrayList<Integer>();
	
		int a = 0;
		result.add(a);
			
		int b = 1;
		result.add(b);


		while(a+b <= n){
			int c = a + b;
			result.add(c);
			a = b;
			b = c;
				
		}
			
	return result;
			
	}
		
}

