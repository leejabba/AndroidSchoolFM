package com.heythisway.java.extend.city.hospital;

import com.heythisway.java.extend.city.design.People;

public class Nurse extends People {
	@Override
	public void move(String direction){
		
		System.out.println("간호사가 " + direction + " 방향으로 움직입니다.");
	}
}
