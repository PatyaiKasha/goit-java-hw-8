public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle(10, 10, 5);
		Shape square = new Square(10);
		Shape triangle = new Triangle(3, 4, 5);
		Shape ellipse = new Ellipse(5, 10);
		Shape rectangle = new Rectangle(5, 10);

		System.out.println(ShapeHandler.getShapeName(circle));
		System.out.println(ShapeHandler.getShapeName(square));
		System.out.println(ShapeHandler.getShapeName(triangle));
		System.out.println(ShapeHandler.getShapeName(ellipse));
		System.out.println(ShapeHandler.getShapeName(rectangle));
	}
}
