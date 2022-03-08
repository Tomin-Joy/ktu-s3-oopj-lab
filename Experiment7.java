/*******************************************************************
 * File  : Experiment
 * Author: Name
 * Date  : DD/MM/YYYY
 *******************************************************************/
abstract class Shape{
	abstract void noOfSides();
}
class Rectangle extends Shape{
	void noOfSides() {
		System.out.println("The number of sides in rectangle = 4");
	}
}
class Triangle extends Shape{
	void noOfSides() {
		System.out.println("The number of sides in triangle = 3");
	}
}
class Hexagon extends Shape{
	void noOfSides() {
		System.out.println("The number of sides in hexagon = 6");
	}
}
public class Experiment7 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		rectangle.noOfSides();
		triangle.noOfSides();
		hexagon.noOfSides();
	}
}
