package ex01;

public class ArrayTest01 {
	//Array : 여러변수를 하나의 이름으로 통일해서 사용
	public static void main(String[] args) {
		//이서 · 가을 · 안유진 · 장원영 · 리즈 · 레이
		System.out.println("이서");
		System.out.println("가을");
		System.out.println("안유진");
		System.out.println("장원영");
		System.out.println("리즈");
		System.out.println("레이");
		System.out.println();
		
		String [] ives = new String[] {"이서","가을","안유진","장원영","리즈","레이"};
		System.out.println(ives[3]);
		
		System.out.println();
		
		for(int i =0; i<ives.length;i++) {
			System.out.println(ives[i]);
		}
		// System.out.println(ives[6]); //exception
	}

}
