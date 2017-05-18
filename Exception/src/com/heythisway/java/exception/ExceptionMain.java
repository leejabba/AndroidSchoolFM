package com.heythisway.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		int array[] = new int[6];
		try{
			array[0] = 5;
			//array[6] = 11;
			array[5] = 10;
			//int x = 1/0;
			
			String s = "a";
			int a = Integer.parseInt(s);
			
		}catch(ArrayIndexOutOfBoundsException e){
//			String msg = e.toString();
//			System.out.println(msg);
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			//System.out.println("오류!!!! 정수 형식 오류가 발생하였습니다.");
			e.printStackTrace();
		}finally{
			System.out.println("다섯번째의 값:" + array[5]);
		}
		System.out.println("시스템이 완료되었습니다");
	}

}
