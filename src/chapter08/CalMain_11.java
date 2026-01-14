package chapter08;

import java.util.Scanner;

public class CalMain_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 방법1
		Example[] calculators = { new CalPlus(), new CalMinus() };
		
		//Example calculators1 = new CalPlus();
		//Example calculators2 = new CalMinus();		
		
		System.out.print("첫번째 숫자: ");
		int n1 = scan.nextInt();

		System.out.print("두번째 숫자: ");
		int n2 = scan.nextInt();

		for (Example cal : calculators) {
			System.out.println(cal.getClass().getSimpleName() + ": " + cal.getResult(n1, n2));
		}
		
		//메서드 활용방법2
		int plus = calc(new CalPlus(), n1, n2);
		System.out.println("두 수의 합: " +plus);
		
		int minus = calc(new CalMinus(), n1, n2);
		System.out.println("두 수의 ck: " +minus);
		
		
/*		Example plus = new CalPlus();
		Example minus = new CalMinus();

		System.out.println("CalPlus: " + plus.getResult(n1, n2));
		System.out.println("CalMinus: " + minus.getResult(n1, n2));
*/
	}
	
	public static int calc(Example ex, int a, int b) {
		return ex.getResult(a, b);
	}

}
