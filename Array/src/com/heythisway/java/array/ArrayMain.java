package com.heythisway.java.array;

public class ArrayMain {

	public static void main(String[] args) {
		
		
		//배열 선언 & 초기화
		int arr[] = new int[10];	//기본형이기때문에 선언과 동기에 초기화가 된다.
		int arr2[] = {1,2,3,4,5};
		
		//기본형 배열이기 때문에 값이 자동으로 0으로 입력되어 출력된다.
		for( int a1 : arr ){
			System.out.println(a1);
		}
		
		//배열에 값이 미리 할당 되어 있기 때문에 정해진 값이 출력된다.
		for ( int a2 : arr2 ){
			System.out.println(a2);
		}
		
		
		//클래스형(객체) 배열은 어떤지 살펴보자
		ArraySub subs[] = new ArraySub[10];	//기본형이 아니기때문에 선언만 된다. 반드시 초기화를 따로 할 것
		
		//초기화 하기
		subs[0] = new ArraySub();
		subs[1] = new ArraySub();
		subs[2] = new ArraySub();
		subs[3] = new ArraySub();
		subs[4] = new ArraySub();
		subs[5] = new ArraySub();
		subs[6] = new ArraySub();
		subs[7] = new ArraySub();
		subs[8] = new ArraySub();
		subs[9] = new ArraySub();
		
		//초기화를 하지 않았다면 기본형이 아닌 배열이기 때문에 자동으로 값이 입력되지 않아 NullPointerException 에러가 발생한다.
		for ( ArraySub sub : subs ){
			System.out.println(sub.a);	
		}
		
		
		
		ArraySub arraySub = new ArraySub();  //객체를 생성하는 순간 컴파일러가 자동으로 변수(a)를 초기화 시켜준다.
		arraySub.printNumber();

	}

}
