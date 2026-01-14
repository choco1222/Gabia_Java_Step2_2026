package chapter09;

public class CarMain_05 {

	public static void main(String[] args) {

		me(new AICar());
		System.out.println("-----------------");
		me(new ManualCar());
		
	}
	
	public static void me(Car c) {
		c.run();
	}

}
