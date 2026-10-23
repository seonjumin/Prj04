package ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
	    System.out.println("현재 날짜와 시간: " + now);
		
		String yoil = getYoil(); //금요일
	    System.out.println("오늘 한자:"+yoil);

	}

	private static String getYoil() {
		String[] y = new String[] {"月","火","水","木","金","土","日"};
		LocalDate now = LocalDate.now();
		int wk = now.getDayOfWeek().getValue(); //1~7
		String yoil = y[wk -1];
		return yoil +"요일";
	}

}
