package chapter07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain_05 {

	public static void main(String[] args) {

		// 일산점 031-123-5678 이자율 5.3f
		// 종로점 02-852-9856

		String point = JOptionPane.showInputDialog("지점명");
		String tel = JOptionPane.showInputDialog("전화번호");

		Bank bank = new Bank(point, tel);

		Scanner scan = new Scanner(System.in);
		System.out.print(point + "지점의 퇴직연금의 이자를 입력하세요: ");

		Bank.interest = scan.nextFloat();
		bank.getBank();
		System.out.println();

		String point2 = JOptionPane.showInputDialog("지점명");
		String tel2 = JOptionPane.showInputDialog("전화번호");

		Bank bank2 = new Bank(point2, tel2);
		bank2.getBank();

	}

}
