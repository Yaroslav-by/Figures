package quadrilaterals;

public class Rectangle extends Quadrilaterals{
	
	Rectangle(int width, int length) {
		super.setSideA(width);
		super.setSideC(width);
		super.setSideB(length);
		super.setSideD(length);
	}
	
}
