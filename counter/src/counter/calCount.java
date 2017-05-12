//이자빠의 답변
package counter;

public class calCount {

	public void changeCal(int payment, int purchase){
		int totalChange = 0;	//총 거스름돈 
		int subChange = 0;		//잔여 거스름돈 
		int fiveTh = 0;			//오천원 
		int tenTh = 0;			//천원
		int fiveHu = 0;			//오백원
		int tenHu = 0;			//백원
		int fiveTen = 0;		//오십원
		int tenTen = 0;			//십원
		
		totalChange = payment - purchase;
		fiveTh = totalChange / 5000;
		subChange = totalChange - (fiveTh*5000);
		tenTh = subChange / 1000;
		subChange = totalChange - (fiveTh*5000) - (tenTh*1000);
		fiveHu = subChange / 500;
		subChange = totalChange - (fiveTh*5000) - (tenTh*1000) - (fiveHu*500);
		tenHu = subChange / 100;
		subChange = totalChange - (fiveTh*5000) - (tenTh*1000) - (fiveHu*500) - (tenHu*100);
		fiveTen = subChange / 50;
		subChange = totalChange - (fiveTh*5000) - (tenTh*1000) - (fiveHu*500) - (tenHu*100) - (fiveTen*50);
		tenTen = subChange / 10;
		

		System.out.println("가격 : " + purchase + "원");
		System.out.println("지불한 돈 : " + payment + "원");
		System.out.println();
		System.out.println("총 거스름돈 : " + totalChange + "원");
		System.out.println("오천원 : " + fiveTh + "개");
		System.out.println("천원 : " + tenTh + "개");
		System.out.println("오백원 : " + fiveHu + "개");
		System.out.println("백원 : " + tenHu + "개");
		System.out.println("오십원 : " + fiveTen + "개");
		System.out.println("십원 : " + tenTen + "개");
	}
	
}
