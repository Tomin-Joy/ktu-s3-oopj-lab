/*******************************************************************
 * File  : Experiment
 * Author: Name
 * Date  : DD/MM/YYYY
 *******************************************************************/

import java.util.Scanner;
class Shapes{
	void area(double radius) {
		System.out.println("Area of circle is "+(3.14*radius*radius));
	}
	void area(double bredth,double width) {
		System.out.println("Area of rectangle is "+( bredth*width));
	}
	void area(int base,int height) {
		System.out.println("Area of triangle is "+( 0.5*base*height));	
	}
}
public class Experiment4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Shapes s = new Shapes();
		double radius,bredth,width;
		int base,height;
		System.out.print("Enter the radius of circle : ");
		radius = sc.nextDouble();
		s.area(radius);
		System.out.print("Enter the bredth of rectangle: ");
		bredth = sc.nextDouble();
		System.out.print("Enter the width of rectangle : ");
		width = sc.nextDouble();
		s.area(bredth, width);
		System.out.print("Enter the height of triangle : ");
		height = sc.nextInt();
		System.out.print("Enter the base of triangle : ");
		base = sc.nextInt();
		s.area(base, height);
		sc.close();
	}
}
