package chapter09;

public class PhoneMain_04 {

	public static void main(String[] args) {

		// 추상클래스로 객체 생성 안됨

		SmartPhone smart = new SmartPhone("김자바");

		System.out.println(smart.owner + "님");
		smart.turnOn();
		smart.intersearch();
		smart.turnOff();
	}

}
