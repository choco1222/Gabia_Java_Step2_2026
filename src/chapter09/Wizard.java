package chapter09;

public class Wizard extends GameCharacter{

	@Override
	protected void attack() {
		System.out.println("화염방사");
	}

	@Override
	protected void useUItimate() {
		System.out.println("지팡이를 사용");
	}

}

