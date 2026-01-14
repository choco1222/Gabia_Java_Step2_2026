package chapter08;

public class ApplianceMain_05 {

	public static void main(String[] args) {

		Appliance tv = new TV("삼성");
		
		tv.turnOn();
		tv.turnOff();
		
		Appliance wash = new Washer("LG");
		
		wash.turnOn();
		wash.turnOff();
		System.out.println();
		
		Appliance[] list = new Appliance[3];
		list[0] = new Washer("LG");
		list[1] = new Washer("Samsung");
		list[2] = new Washer("Daewoo");
		
		for(Appliance a:list) {
			a.turnOff();
		}
		
	}

}
