
public class PrimitiveDataTypeExam {

	public static void main(String[] args) {
		int[] iarray = new int[100];
		int iarray_length = iarray.length;
		int sum = 0;
		System.out.println("iarray배열의 크기 : " + iarray_length);
		
		
		for (int i = 0 ; i < iarray_length ; i++){
			iarray[i] = i + 1;	
			sum += iarray[i];	
		}
		
		System.out.println("iarray배열 값들의 합계 : " + sum);
		
		// 2차원 배열
		int[][] array4 = new int[3][4];
		
	}

}
