package chapter09;

public class GameMain_06 {

	public static void main(String[] args) {

		System.out.println("===전사 전투===");
		go(new Warrior());
		
		System.out.println("===마법사 전투===");
		go(new Wizard());
	}
	
	public static void go(GameCharacter game) {
		game.fight();
	}

}
