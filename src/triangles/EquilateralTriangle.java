package triangles;

public class EquilateralTriangle extends Triangle {
	
	EquilateralTriangle(int side) {
		super.setSideA(side);
		super.setSideB(side);
		super.setSideC(side);
	}
	
	public double getSq() {
		return this.getSideA() * Math.sqrt(3) / 2;
	}

}
