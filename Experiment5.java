/*******************************************************************
 * File  : Experiment
 * Author: Name
 * Date  : DD/MM/YYYY
 *******************************************************************/
import java.util.Scanner;
class Employeee {
	Scanner sc = new Scanner(System.in);
	int basicSalary;
	double DA,HRA,grossSalary;
	// to display gross salary of engineer
	void display() {
		System.out.println("Gross salary of engineer is "+grossSalary);
	}
	// for calculating gross salary
	void calcSalary() {
		grossSalary =  basicSalary+ DA*basicSalary*0.01 + HRA* basicSalary*0.01; 
	}
	// for reading data from user
	void readData() {
		System.out.println("Enter basic salary of Engineer :");
		basicSalary = sc.nextInt();
		System.out.println("Enter DA of the Engineer : ");
		DA=sc.nextFloat();
		System.out.println("Enter HRA of the Engineer : ");
		HRA=sc.nextFloat();	
	}
}

class Engineer extends Employeee {}  //inherits attributes and methods from class Employeee

public class Experiment5 {
	public static void main(String[] args) {
		Engineer engineer = new Engineer(); // creating an object of Engineer 
		engineer.readData();
		engineer.calcSalary();
		engineer.display();
	}
}
