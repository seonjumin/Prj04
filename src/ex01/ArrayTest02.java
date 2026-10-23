package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int[] sales = new int[] {100, 80, 90,110};
		
		int total = 0;
		for(int i=0; i<sales.length; i++) {
			total += sales[i];
		}
		System.out.println(total);
		
		//2차원배열 연습 (= 행과 열의 갯수가 똑같을 때만 2차원이다.)
		double [][] salesTotal = new double[][] {
			{100, 101, 90, 80},		//2022 : salesTotal[0](=첫번째 배열의 이름)
			{120, 101, 90, 180},	//2023 : salesTotal[1]
			{100, 130, 190, 280},	//2024 : salesTotal[2]
			{100, 101, 290, 80},	//2025 : salesTotal[3]
			{100, 101, 390, 180}	//2026 : salesTotal[4]
		};
		
		System.out.println("연도의 갯수" + salesTotal.length);
		System.out.println("2024년도의 매출갯수" + salesTotal[2].length);
		System.out.println(salesTotal[3][3]);
		
		//2024년 매출수량의 합?
		total = 0;
		for(int i=0; i<salesTotal[2].length; i++) {
			total += salesTotal[2][i];
		}
		System.out.println(total);
		int sum=0;
		for(int i=0; i<salesTotal.length; i++) {
			for(int j=0; j<salesTotal[j].length; j++) {
				sum += salesTotal[i][j];
			}	
		}
		System.out.println(sum);
	}

}
