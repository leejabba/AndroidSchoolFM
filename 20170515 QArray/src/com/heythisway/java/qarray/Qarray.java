package com.heythisway.java.qarray;

public class Qarray {
	
	public void drawSnail(int count){
		// 총 출력해야 되는 숫자의 개수
		int total = count * count;
		int[][] array = new int[count][count];
		
		int i = 0;
		int j = 0;
		
		int n = 1;
		int rootCount = 0;

		while(n<=total){
		
			// 오른쪽 방향으로 이동
			for (; j<count-rootCount ; j++){
				array[i][j] = n++;
			} 
			j = j - 1;
	
	
			// 아래쪽 방향으로 이동
			for (i=i+1 ; i<count-rootCount ; i++){
				array[i][j] = n++;
			}
			i = i - 1;
	
			
			// 왼쪽 방향으로 이동
			for (j=j-1; j>=rootCount ; j--){
				array[i][j] = n++;
			}
			j = j + 1;
	
			// 위쪽 방향으로 이동
			for (i=i-1; i>rootCount ; i--){
				array[i][j] = n++;
			}
			i = i + 1;
			j = j + 1;			

			// 전체 회수 증가
			rootCount = rootCount + 1;
		}

		
		
			
		// 출력 
		for(int a=0 ; a<count ; a++){
			for(int b=0 ; b<count ; b++){
				System.out.print("[" + array[a][b] + "] " + " ");
			}
			System.out.println("");
		}
	}
}
