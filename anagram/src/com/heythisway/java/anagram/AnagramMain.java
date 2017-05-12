package com.heythisway.java.anagram;

import java.util.Scanner;

public class AnagramMain {

	public static void main(String[] args) {
		
		Anagram anagram = new Anagram();
		
		// 사용자에게 문자 받기
		System.out.println("anagram 테스트에 오신 것을 환영합니다 :)"
				+ "\n" + "두 개의 알파벳 단어를 입력하세요");
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("첫번째 단어를 입력하세요.");
			String n = scanner.nextLine();
			System.out.println("두번째 단어를 입력하세요.");
			String m = scanner.nextLine();
			
			anagram.processAnagram(n, m);
			
			// 중단을 원하는지 묻기
			System.out.println("테스트를 계속하시겠습니까? : 1.계속, 2.종료");
			String ask = scanner.nextLine();
			if (ask.equals("2")){
				System.out.println("테스트가 종료되었습니다. 감사합니다.");
				break;
			}
		}
		

	}

}
