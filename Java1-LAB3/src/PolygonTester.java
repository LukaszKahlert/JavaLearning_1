import java.util.ArrayList;

abstract class Polygon {

	private ArrayList<Double> sides;

	public Polygon() {
		this.sides = new ArrayList<Double>();
	}

	public abstract double surface();

	public abstract double perimeter();

	public ArrayList<Double> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Double> sides) {
		this.sides = sides;
	}

}

class Triangle extends Polygon {
	private double bok1;
	private double bok2;
	private double bok3;

	public Triangle(double bok1, double bok2, double bok3) {
		super();
		this.bok1 = bok1;
		this.bok2 = bok2;
		this.bok3 = bok3;
		getSides().add(bok1);
		getSides().add(bok2);
		getSides().add(bok3);
	}

	public double getBok1() {
		return bok1;
	}

	public void setBok1(double bok1) {
		this.bok1 = bok1;
	}

	public double getBok2() {
		return bok2;
	}

	public void setBok2(double bok2) {
		this.bok2 = bok2;
	}

	public double getBok3() {
		return bok3;
	}

	public void setBok3(double bok3) {
		this.bok3 = bok3;
	}

	public double surface() {
		double a = getSides().get(0);
		double b = getSides().get(1);
		double c = getSides().get(2);

		return (Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c))) / 4; //wzór Herona
	}

	public double perimeter() {
		return bok1 + bok2 + bok3;
	}

}

class Rectangle extends Polygon {
	private double bok1;
	private double bok2;

	public Rectangle(double bok1, double bok2) {
		super();
		this.bok1 = bok1;
		this.bok2 = bok2;
		getSides().add(bok1);
		getSides().add(bok2);
	}

	public double getBok1() {
		return bok1;
	}

	public void setBok1(double bok1) {
		this.bok1 = bok1;
	}

	public double getBok2() {
		return bok2;
	}

	public void setBok2(double bok2) {
		this.bok2 = bok2;
	}

	public double surface() {
		double a = getSides().get(0);
		double b = getSides().get(1);
		return a * b;
	}

	public double perimeter() {
		return 2 * bok1 + 2 * bok2;
	}

}

class Square extends Polygon {  // zmieni³em klasê nadrzêdn¹ dla Square z Rectangle na Polygon
	private double bok1; 		// poniewa¿ w przypadku dziedziczenia po rectangle musia³a by przyjmowaæ w
								// konstruktorze
								// dwa boki, a w poleceniu jest napisane,¿e ma przyjmowaæ tylko jeden

	public double getBok1() {
		return bok1;
	}

	public void setBok1(double bok1) {
		this.bok1 = bok1;
	}

	public Square(double bok1) {
		super();
		this.bok1 = bok1;
		getSides().add(bok1);
	}

	public double surface() {
		double a = getSides().get(0);
		return a * a;
	}

	public double perimeter() {
		return 4 * bok1;
	}

}

public class PolygonTester {

	public static void main(String[] args) {
		Square square = new Square(2);
		System.out.println("Pole kwadratu o boku a= " + square.getBok1() + " wynosi: " + square.surface()
				+ "; natomiast obwód: " + square.perimeter());

		Rectangle rectangle = new Rectangle(2, 3);
		System.out.println("Pole prostok¹tu o boku a= " + rectangle.getBok1() + " oraz b= " + rectangle.getBok2()
				+ " wynosi: " + rectangle.surface() + "; natomiast obwód: " + rectangle.perimeter());

		Triangle triangle = new Triangle(6, 5, 7);
		System.out.println("Pole trójk¹tu o boku a= " + triangle.getBok1() + " oraz b= " + triangle.getBok2()
				+ " oraz c= " + triangle.getBok3() + " wynosi: " + triangle.surface() + "; natomiast obwód: "
				+ triangle.perimeter());
	}
}
