package chapter10.Interface;

public class MyClassMain_04 {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		mClass.x();
		mClass.y();
		mClass.myMethod();
		System.out.println("--------------");
		
		// X클래스 타입
		
		X x = new MyClass();
		
		x.x();
		System.out.println("--------------");
		
		// Y클래스 타입
		
		Y y = new MyClass();
		
		y.y();
		System.out.println("--------------");
		
		//MyInterface클래스 타입
		
		MyInterface inter = new MyClass();
		
		inter.x();
		inter.y();
		inter.myMethod();
		
	}

}
