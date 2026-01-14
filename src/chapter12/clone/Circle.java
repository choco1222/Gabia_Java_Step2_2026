package chapter12.clone;

public class Circle implements Cloneable{

	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
		
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}



	@Override
	public String toString() {//객체의 내용보기
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
}
