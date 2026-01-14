package chapter09;

public class Warrior extends GameCharacter{

	@Override
	protected void attack() {
		System.out.println("찌르기");
	}

	@Override
	protected void useUItimate() {
		System.out.println("검을 사용");
	}

}
