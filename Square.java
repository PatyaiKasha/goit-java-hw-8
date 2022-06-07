public class Square extends Shape {
	private int a;
	private final String name = "Square";

	public Square(int a) {
		this.a = a;
	}

	@Override
	protected String getName() {
		return name;
	}

	public int getA() {
		return a;
	}
}
