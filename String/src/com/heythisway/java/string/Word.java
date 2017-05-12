package com.heythisway.java.string;

public class Word {

	public static void main(String[] args) {
		
		String name = "안녕하세요";
		
		// 1. 글자 자르기
		// 문자열의 인덱스 -> "0안1녕2하3세4요5" -> 1에서 2까지 = 녕이 추출
		String secondWord = name.substring(1, 2); 	
		System.out.println(secondWord);
		
		// 2. 문자열 길이
		int 문자열길이 = name.length();
		System.out.println(문자열길이);
		
		// 3. 한글자만 추출하기
		char 한글자 = name.charAt(3);
		System.out.println(한글자);
		
		// 4. 글자 순서 찾기
		int 몇번째 = name.indexOf("하세");
		System.out.println(몇번째);
		
		// 5. 기준으로 그룹을 나누기
		String 두덩이[] = name.split("하");
		System.out.println(두덩이[0]);
		System.out.println(두덩이[1]);
		
		// 6. 글자 치환
		String 바뀐글 = name.replace("하", "랄랄라");
		System.out.println(바뀐글);
	}
	
}
