package com.heythisway.java.list;

import java.util.ArrayList;
import java.util.List;

public class PeopleMain {

	public static void main(String[] args) {
		// 몇 명의 인스턴스를 생성할지 모르니 List를 활용
		List<People> arrayPeople = new ArrayList<People>();	// ArrayList의 다형성, People 오브젝트만 값으로 가질 수 있도록 제네릭 설정

		// for문을 이용해 arrayPeople의 0번째부터 4번째 인덱스에 차례로 People 데이터타입 인스턴스를 생성하면서 바로 저장
		for(int i=0 ; i<5 ; i++){
		arrayPeople.add(new People());	// arrayPeople가 이미 People 데이터타입으로 만들어졌으므로 바로 인스턴스 생성이 가능
		}
		
		// .get 속성을 이용해 값을 추출
		arrayPeople.get(0).name = "김씨";
		arrayPeople.get(0).age = 24;
		arrayPeople.get(0).gender = "남자";

		arrayPeople.get(1).name = "이양";
		arrayPeople.get(1).age = 34;
		arrayPeople.get(1).gender = "여자";
			
		arrayPeople.get(2).name = "서군";
		arrayPeople.get(2).age = 23;
		arrayPeople.get(2).gender = "남자";
			
		arrayPeople.get(3).name = "한군";
		arrayPeople.get(3).age = 34;
		arrayPeople.get(3).gender = "남자";
			
		arrayPeople.get(4).name = "김양";
		arrayPeople.get(4).age = 23;
		arrayPeople.get(4).gender = "여자";
		
		for(People temp : arrayPeople){
			temp.printPeople();
		
//		// 코드 간소화를 위해 arrayPeople를 담을 수 있는 People 데이터타입의 변수 설정
//		People temp = new People();
//
//		// .length 속성을 이용해 for문의 조건식을 완성
//		for(int i = 0 ; i<arrayPeople.size() ; i++){
//			temp = arrayPeople.get(i);
//			temp.printPeople();
		}

	}

}
