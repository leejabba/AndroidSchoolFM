package com.heythisway.java.fibonacci;

import java.util.ArrayList;

public class FibonacciMain {

	public static void main(String[] args) {
		
		ArraySub_arrayList fifi = new ArraySub_arrayList();
		fifi.process(8);
		
		ArrayList<Integer> array = fifi.process(15);
		
		for(int number:array){
			System.out.println(number);
		}
		 
		fibonacci fi = new fibonacci();
		fi.printFibonacci(5);

	}
	
//	// 반환 타입이 있는 함수 구현
//	public int funcitonWithReturn(){
//		int result = 0;
//		
//		// TODO
//		
//		return result;
//	}

}
