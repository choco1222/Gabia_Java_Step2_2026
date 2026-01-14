package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserInfoMain_05 {

	public static void main(String[] args) {
		// UserInfo 타입의 ArrayList -> arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		UserInfo u = new UserInfo();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.print("아이디 생성(exit입력시 종료): ");
			u.setId(scan.next());
			
			if(u.getId().equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				return;
			}else {
				System.out.print("패스워드 입력: ");
				u.setPwd(scan.nextInt());
			}
			arr.add(u);
			System.out.println(u.toString());	

		} // while
		
	}

}
