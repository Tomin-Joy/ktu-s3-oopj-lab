package basic_programs;

import java.util.Scanner;
class Operations{
	int sum;
	int diff;
	int product;
	float div;


	void Sum(int n1,int n2) {
		sum = n1+n2;
		System.out.println("Sum = "+sum);

	}
	
	void Division(int n1,int n2) {
		div = (float)n1/n2;
		System.out.println("Div = "+div);

	}
	
	void Product(int n1,int n2) {
		product = n1*n2;
		System.out.println("Product = "+product);

	}
	
	void Difference(int n1,int n2) {
		diff = n1-n2;
		System.out.println("Difference = "+diff);

	}
}

public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		System.out.print("Enter first number : ");
		number1 = sc.nextInt();
		/*System.out.print("Enter second number : ");
		number2 = sc.nextInt();
		Operations s = new Operations();
		s.Sum(number1, number2);
		s.Difference(number1, number2);
		s.Product(number1, number2);
		s.Division(number1, number2);*/
		System.out.println(number1>>1);
		sc.close();
	}

}
