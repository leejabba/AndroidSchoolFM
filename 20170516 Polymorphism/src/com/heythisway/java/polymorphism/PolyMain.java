package com.heythisway.java.polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		Father son = new Son();
		son.setName("주니어");
		son.setAge(17);
		
		System.out.println(son.getName());
		
	}

}
