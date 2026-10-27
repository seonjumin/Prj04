package ex02;

public class Student {
	 int num;
	 String name;
	 int kor;
	 int eng;
	 int mat;
	 int total;
	 double avg;
	
	Student(int num, String name, int kor, int eng, int mat){
			this.num = num;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
	
	}
	private void process() {
		total = kor + eng + mat;
		avg = ((int)(total * 100 + 0/5) / 100.0)/3;
		
	}
	
	public void output() {
		process();
		System.out.println("번호  이름     총점    평균");
			System.out.printf(" %d    %s   %d  %10.3f\n", num, name, total, avg);
	}
}
