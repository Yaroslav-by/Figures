package triangles;
import Figures.Figure;

public class Triangle extends Figure{
	
	private int sideA;
	private int sideB;
	private int sideC;
	
	Triangle() {
		super.setName(this.getClass().getSimpleName());
	}
	
	Triangle(int sideA, int sideB, int sideC) {
		super.setName(this.getClass().getSimpleName());
		if ((sideA < sideB + sideC) || (sideB < sideA + sideC) || (sideC < sideB + sideA)) {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		} else {
			System.out.println("It's impossible to create triangle!");
		}
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
	}
	
	
}
