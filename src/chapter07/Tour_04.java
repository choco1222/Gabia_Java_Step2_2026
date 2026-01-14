package chapter07;

import java.util.Scanner;

public class Tour_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수: ");
		int n = scan.nextInt();
		boolean run = true;

		// 초기화를 통해서 참조 메모리 확보(Guide의 객체 갯수)
		Guide guide = new Guide(n);

		System.out.println();
		System.out.println("관광객 등록");
		// 이름 성별
		for (int i = 0; i < n; i++) {
			System.out.print("이름 입력: ");
			String name = scan.next();
			guide.guest[i].setName(name);
			System.out.print("성별 입력: ");
			String gender = scan.next();
			guide.guest[i].setGender(gender);
		} // for
		System.out.println();

		while (run) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");

			int select = scan.nextInt();

			switch (select) {
			case 1:
				for (int j = 0; j < n; j++) {
					System.out.println("이름: " + guide.guest[j].getName());
					System.out.println("성별: " + guide.guest[j].getGender());
					System.out.println("목적지: " +guide.point);
				}
				break;
			case 2:
				System.out.print("변경할 목적지를 입력하세요: ");
				guide.point = scan.next();
				System.out.println("목적지가 " + guide.point + "로 변경되었습니다.");
				break;
			case 3:
				System.out.println("종료");
				run = false;
			} // switch

		} // while

	}

}
