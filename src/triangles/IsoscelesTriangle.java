package triangles;

public class IsoscelesTriangle extends Triangle {

	IsoscelesTriangle(int sideA, int SideB) {
		super.setSideA(sideA);
		super.setSideB(SideB);
		super.setSideC(SideB);
	}
	
	public double getSq() {
		return (this.getSideA() / 4) * Math.sqrt(4 * Math.pow(this.getSideB(), 2) - Math.pow(this.getSideA(), 2));
	}
	
}
