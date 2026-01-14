package chapter08;

public class CompanyMain_09 {

	public static void main(String[] args) {

		// Employee 객체 생성후 메서드 사용
		
		Employee emp = new Employee("홍길동", 5000);
		emp.work();
		emp.getInfo();
		System.out.println();
		// Manager 객체 생성후 메서드 사용
		Manager man = new Manager("임꺽정", 8000, "개발");
		man.work();
		man.getInfo();
		man.approveLeave("김직원");
		System.out.println();
		
		// 상속개념이 보이게 객체 생성후 메서드 사용(emp와 man의 교집합만 가능)
		Employee per = new Manager("James", 7000, "영업");
		per.work();
		per.getInfo();
		//per.approveLeave(); 컴파일 에러(객체의 주체 Employee 타입으로 간주)
		
		
	}

}
