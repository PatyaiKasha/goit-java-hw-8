public class Ellipse extends Shape {
	private int a;
	private int b;
	public static final float PI = 3.141592f; // S = a * b * PI; Just FYI.
	private final String name = "Ellipse";

	public Ellipse(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	protected String getName() {
		return name;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
}
