package chapter08;

public class Student extends People {

	public int studentNo;

	public Student(String name, String phone, int studentNo) {
		super(name, phone);
		this.studentNo = studentNo;
	}

}
