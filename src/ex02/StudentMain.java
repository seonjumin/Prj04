package ex02;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student(1,"안유진",90,80,70);
		
		Student student2 = new Student(2,"카리나",100,90,90);
		
		Student student3 = new Student(3,"장원영", 80,40,100);
		
		Student[] students = {student1, student2, student3};
		
		for(int i=0; i<students.length; i++) {
			students[i].output();
		}
		
	}

}
