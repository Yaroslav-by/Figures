package triangles;

public class RightTriangle extends Triangle{

	public double getSq() {
		return super.getSideA() * super.getSideB() / 2;
	}
}
