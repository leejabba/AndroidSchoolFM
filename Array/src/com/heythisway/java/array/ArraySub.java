package com.heythisway.java.array;

public class ArraySub {

	//전역변수 설정
	int a;
	
	/*
	 접근제한자 리턴타입 함수명(){ }
	 - 접근제한자 : 생략가능 - 생략하면 자동으로 default로 인식 (public, private, 프로텍티드, default)
	 -- public 모든 패키지, 클래스에서 사용가능
	 -- private 모든 패키지, 클래스에서 사용불가
	 -- default 같은 패키지, 클래스에서만 사용가능
	 - 리턴타입 : 필수
	 
	 접근제한자를 생략하면 컴파일러는 자동으로 default로 선언하게 된다.
	 패키지가 달라도 접근할 수 있는 유일한 것은 public이다.
	 */
	
	public void printNumber(){
		System.out.println(a);
	}
	
}
