package chapter07;

public class StudentMain {

	public static void main(String[] args) {

		// studentLee에 이수정으로 설정후 serialNum과 studentName 출력

		Student_03 studentLee = new Student_03(); // studentID = 10001
		studentLee.setStudentName("이수정");

		System.out.println("이름: " + studentLee.getStudentName());
		System.out.println("일련번호: " + studentLee.serialNum);
		System.out.println("ID: " + studentLee.studentID);

		System.out.println();
		Student_03 studentKim = new Student_03(); // studentID = 10001
		studentKim.setStudentName("김우성");
		
		System.out.println("이름: " + studentKim.getStudentName());
		System.out.println("일련번호: " + studentKim.serialNum);
		System.out.println("ID: " + studentKim.studentID);

		System.out.println();
		Student_03 studentPark = new Student_03(); // studentID = 10001
		studentPark.setStudentName("박정우");
		
		System.out.println("이름: " + studentPark.getStudentName());
		System.out.println("일련번호: " + studentPark.serialNum);
		System.out.println("ID: " + studentPark.studentID);
	}

}
