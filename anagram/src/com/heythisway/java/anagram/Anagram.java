package com.heythisway.java.anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public void processAnagram(String n, String m){
		
		// 문자열을 분해해 배열에 담기
		String tempN[] = n.split("");
		String tempM[] = m.split("");
		
		// 문자 개수 비교하기 
		if (tempN.length == tempM.length){
			//System.out.println("두 단어의 길이가 같습니다.");
			
			// 배열 n,m 정렬
			Arrays.sort(tempN);
			Arrays.sort(tempM);
			
			// 비교하기
			int count = 0;	// 일치하는 갯수 체크용
			for (int i=0 ; i<tempN.length ; i++){
				if (tempN[i].equals(tempM[i])){
					count = count + 1;
				}
			}
			
			// count와 문자열 갯수 체크
			if (tempN.length == count){
				System.out.println("두 단어는 anagram 관계입니다.");
			} else {
				System.out.println("두 단어는 anagram 관계가 아닙니다.");
			}			
		} else {
			System.out.println("두 단어의 길이가 같지 않습니다.");
		}		
	}
}
