public class Rectangle extends Shape{
	private int a;
	private int b;
	private final String name = "Rectangle";

	public Rectangle(int a, int b) {
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
