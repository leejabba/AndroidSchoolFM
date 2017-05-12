package com.heythisway.java.collection;

import java.util.ArrayList;
import java.util.HashMap;

import com.heythisway.java.collection.dumy.Student;

public class CollectionMain {

	public static void main(String[] args) {
		
		// 컬렉션의 종류
		// --------------------------------------------
		// 1. List 계열
		// .add() : 값 입력
		// .get() : 값 획득(출력)
		
		ArrayList<Student> list = new ArrayList<>();
		
		Student a1 = new Student();
		a1.name = "홍길동";
		a1.age = 500;
		
		Student a2 = new Student();
		a2.name = "이순신";
		a2.age = 1000;
		
		list.add(a1);
		list.add(a2);
		
		for(Student item : list){
			System.out.println(item.name + " " + item.age);
		}
		
		/*
		ArrayList<Integer> list = new ArrayList<>();	//정수 타입만 넣으라고 강제함.
		ArrayList<String> stringList = new ArrayList<>();
		int a = 33;
		
		list.add(457);
		list.add(1234);	// 제네릭을 사용하지 않는 컬렉션은 입력되는 값을 object로 casting한다.
		stringList.add("하하하");
		stringList.add("abcde");
		
		
		for(int item : list){
			System.out.println(item + 3);
		}
		
		for(String item : stringList){
			System.out.println(item.substring(1, 3));
		}
		*/

		// 스트링 첫번째 글자 출력하기
//		System.out.println("안녕하세요".substring(0, 1));
		
		/*
		// 향상된 for문으로 값 출력 - 문자열로 형변환
		for(Object item : list) {	
			String string = item + "";
			System.out.println(string.substring(0, 1));
		}
		
		// 향상된 for문으로 값 출력 - 숫자로 형변환 할 때는 스트링으로 먼저 변환하고 할 것 (Object > String > int)
		for(Object item : list) {	
			String string = item + "";
			int number = Integer.parseInt(string);
			System.out.println(number + 3);
		}
		
		// 일반 for문으로 값 출력 
		int list_length = list.size();

		for(int i=0; i<list_length ; i++){
			System.out.println(list.get(i));
		}
		*/
		
		
		// 2. Map 계열 - 인덱스 키가 문자열로 지정됨
		// - 키 , 값 의 형태로 저장된다.
		// 회원정보 같은 것을 저장할 때 용이하다.
		HashMap<String, Student> map = new HashMap<>();
		map.put("key1", a1);
		map.put("key2", a2);
		
		System.out.println(map.get("key2").name);
		
		
		
		
		// 3. Set 계열
		// - 리스트와 동작방식이 유사하다. 하지만 중복값을 허용하지 않는다. 예를 들어 주민등록 번호가 중복되면 안되는 경우에.
		
		
		
		

	}

}
