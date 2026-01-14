package chapter10.MultiInterface;

import java.util.Scanner;

public class SchedulerMain_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 가장 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			// toUpperCase(): 대소문자 구분하지 않음
			// 방법1(char)
			char input = scan.next().toUpperCase().charAt(0);
			int ch = (int) input;
			RoundRobin r = new RoundRobin();
			LeastJob l = new LeastJob();
			PriorityAllocation p = new PriorityAllocation();
			
			switch (ch) {
			case 'R', 'r':
				r.getNextCall();
				r.sendCallToAgent();
				break;
			case 'L', 'l':
				l.getNextCall();
				l.sendCallToAgent();
				break;
			case 'P','p':
				p.getNextCall();
				p.sendCallToAgent();
				break;
			case 'S', 's':
				System.out.println("종료");
				run = false;
				break;
			default: System.out.println("지원하지 않는 서비스입니다.");
				
			run = false;
			}
		}
		
	}

}
