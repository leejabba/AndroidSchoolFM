// 강사님의 답변
package counter;

public class CalcChange {

	public void calc(int money, int price){
		
		System.out.println("강사님의 답변용 \n");
		//거스름돈
		int change = money - price;
		System.out.println("거스름돈: " + change + "원");
		
		
		// ------------------------------------------------------------------------------------------------
		//노가다로 구하는 코드
//		//오천원권
//		int c5000 = change / 5000;	//오천원권 갯수를 알아내기 위한 코드
//		change = change - c5000 * 5000;
//		System.out.println("오천원권: " + c5000 + "개");
//		
//		//천원권
//		int c1000 = change / 1000;	//천원권 갯수를 알아내기 위한 코드
//		change = change - c1000 * 1000;
//		System.out.println("천원권: " + c1000 + "개");
//		
//		//오백원권
//		int c500 = change / 500;	//오백원권 갯수를 알아내기 위한 코드
//		change = change - c500 * 500;
//		System.out.println("오백원권: " + c500 + "개");
//		
//		//백원권
//		int c100 = change / 100;	//백원권 갯수를 알아내기 위한 코드
//		change = change - c100 * 100;
//		System.out.println("백원권: " + c100 + "개");
//		
//		//오십원권
//		int c50 = change / 50;	//오십원권 갯수를 알아내기 위한 코드
//		change = change - c50 * 50;
//		System.out.println("오십원권: " + c50 + "개");
//		
//		//십원권
//		int c10 = change / 10;	//십원권 갯수를 알아내기 위한 코드
//		change = change - c10 * 10;
//		System.out.println("십원권: " + c10 + "개");	
		

		// ------------------------------------------------------------------------------------------------
		//함수를 이용한 코드
//		change = printChange(change, 5000);
//		change = printChange(change, 1000);
//		change = printChange(change, 500);
//		change = printChange(change, 100);
//		change = printChange(change, 50);
//		change = printChange(change, 10);
		
		
		// ------------------------------------------------------------------------------------------------
		//일반적 for문과 배열을 이용한 코드
//		int[] units = {5000, 1000, 500, 100, 50, 10};
//		
//		int units_length = units.length;
//		
//		for (int i = 0 ; i < units_length ; i++) {
//			change = printChange(change, units[i]);
//		}
//		
		
		// ------------------------------------------------------------------------------------------------
		//향상된 for문과 배열을 이용한 코드 - 향상된 for문은 배열과 같이 집합된 형태에서만 사용함
		int[] units = {5000, 1000, 500, 100, 50, 10};
		
		for (int i : units) {
			change = printChange(change, i);
		}
	}
	
	
	// 함수부분
	public int printChange(int change, int unit){
		int count = change / unit;	//unit원권의 갯수를 알아내기 위한 변수 count 설정
		change = change - (count * unit);
		System.out.println(unit + "원권 : " + count + "개");
		return change;
	}
}
