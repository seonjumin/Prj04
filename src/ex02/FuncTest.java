package ex02;

import java.util.Scanner;

public class FuncTest {
	
	//입력용
	private static int num;
	private static String name;
	private static int kor;
	private static int eng;
	private static int mat;
	
	//출력용
	private static int total =0;
	private static double avg;
	
	//메인
	public static void main(String[] args) {
		
		
		input();
		process();
		output();
		System.out.println();
		System.out.println("end.....");
		

	}
	
	//input
	private static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호,이름,국어,영어,수학");
		String line = sc.nextLine(); // 하나의 문자열로 전체의 값을 받는다.
		String [] li = line.split(","); // ,를 기준으로 여러문자열로 쪼갠 후 배열에 넣는다.
		num = Integer.parseInt(li[0].trim());
		name = li[1].trim();
		kor = Integer.parseInt(li[2].trim());
		eng = Integer.parseInt(li[3].trim());
		mat = Integer.parseInt(li[4].trim());
		/*
		System.out.print("번호: ");
		num = sc.nextInt();
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		mat = sc.nextInt();
		*/
		
		
	}

	//process
	private static void process() {
		total = kor + eng + mat;
		//avg = (double) total /3.0;
		//반올림된 평균
		avg = (int)(total * 100 + 0.5) / 100.0;
	}
	
	//output
	private static void output() {
		System.out.println("번호  이름     총점    평균");
		System.out.printf(" %d    %s   %d  %10.3f", num, name, total, avg);
											//소수이하 세자리(이후는 자동반올림)
		
	}

}
