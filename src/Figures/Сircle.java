
public class �ircle extends Figure {
	
	private int diameter;
	private int radius;
	
	�ircle() {
		super.setName(this.getClass().getSimpleName());
	}
	
	�ircle(int length, String p) {
		if (p.equals("D")) 
			this.diameter = length;
		else if (p.equals("R"))
			this.radius = length;
		else
			System.out.println("Cannot create circle");
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
