package quadrilaterals;
import Figures.Figure;

public class Quadrilaterals extends Figure{

	private int sideA;
	private int sideB;
	private int sideC;
	private int sideD;
	
	Quadrilaterals() {
		
	}
	
	Quadrilaterals(int sideA, int sideB) {
		
	}
	
	Quadrilaterals(int sideA, int sideB, int sideC, int sideD) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.sideD = sideD;
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

	public int getSideD() {
		return sideD;
	}

	public void setSideD(int sideD) {
		this.sideD = sideD;
	}
	
	
}
