package com.heythisway.java.qarray;

public class QarrayMain {

	public static void main(String[] args) {
		
		Qarray qarray = new Qarray();
		qarray.drawSnail(3);
		
	
		int a = 1;

		switch (a) {
			// a의 값이 1일때 실행
			case 1 : System.out.println("a는 1입니다.");
//			break;

			// a의 값이 2일때 실행
			case 2 : System.out.println("a는 2입니다.");
			break;

			// a의 값이 3일때 실행
			case 3 : System.out.println("a는 3입니다.");
			break;

			// a의 값이 4일때 실행
			default : System.out.println("a는 4입니다.");
//			break;
		}
	}

}
