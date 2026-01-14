package chapter08;

public class StudentMain_04 {

	public static void main(String[] args) {

		Student obj = new Student("홍길동", "010-1111-2222", 2026);
		
		System.out.println("이름: " +obj.name);
		System.out.println("전화번호: " +obj.phone);
		System.out.println("학번: " +obj.studentNo);
		
	}

}
