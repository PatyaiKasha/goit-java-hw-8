public class Triangle extends Shape {
	private int a;
	private int b;
	private int c;
	private final String name = "Triangle";

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
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

	public int getC() {
		return c;
	}
}
