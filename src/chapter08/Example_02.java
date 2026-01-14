package chapter08;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Character[] ch = { new Warrior(), new Mage() };
		System.out.print("기본 공격력: ");
		int power = scan.nextInt();

		// 메서드 활용

		Warrior war = new Warrior();
		Mage magic = new Mage();

		System.out.println("전사의 스킬: "  + useSkill(new Warrior(), power));
		System.out.println("마법사의 스킬: " + useSkill(new Mage(),power));
		
	}
	public static int useSkill(Character ex, int dmg) {
		return ex.attack(dmg);
	}

}
