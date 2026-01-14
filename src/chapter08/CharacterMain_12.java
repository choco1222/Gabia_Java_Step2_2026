package chapter08;

import java.util.Scanner;

public class CharacterMain_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Character[] ch = { new Warrior(), new Mage() };
		System.out.print("기본 공격력: ");
		int power = scan.nextInt();
		
		
		for (Character champ : ch) {
			System.out.println(champ.getClass().getSimpleName() + "의 공격력: " + champ.attack(power));
		}
		
		}
		
	public static int atk(Character ex, int power) {
		return ex.attack(power);
	}

}
