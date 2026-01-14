package chapter10.Interface;

public class SmartTelevisionMain_03 {

	public static void main(String[] args) {

		SmartTelevision smart = new SmartTelevision();
		
		
		smart.turnOn();
		smart.search("예능");
		smart.setVolume(15);
		smart.turnOff();
		System.out.println();
		
		Remote rc = new SmartTelevision();
		
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		System.out.println();
		
		Searchable sea = new SmartTelevision(); 
				
		sea.search("스포츠");
		
	}

}
