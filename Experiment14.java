/*
 * file   : Experiment6
 * Date   : 17-12-2021
 * Author : Tomin Joy
 * Desc   : A program to understand inheritance
 */

//package lab;
import java.util.Scanner;
class Employee{
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	Scanner sc = new Scanner(System.in);
	public void printSalary() {
		System.out.println("The salary is : ₹"+salary);
	}
	
	void readData() {
		
		System.out.print("Enter name : ");
		name = sc.nextLine();
		System.out.print("Enter age : ");
		age = sc.nextInt();
		System.out.print("Enter phone number : ");
		phoneNumber = sc.next();
		System.out.print("Enter address : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.print("Enter salary : ₹");
		salary = sc.nextInt();
	}
	void printData() {
		System.out.println("Name : "+ name);
		System.out.println("Age  : "+age);
		System.out.println("Phone number : "+phoneNumber);
		System.out.println("Address : "+address);
	}
}

class Officer extends Employee {
	String specialization;
	void readData() {
		super.readData();
		System.out.print("Enter Specialization : ");
		sc.nextLine();
		specialization = sc.nextLine();
	}
	
	void printData() {
		super.printData();
		super.printSalary();
		System.out.println("Specialization : "+specialization);
	}
}

class Manager extends Employee {
	String department;
	void readData() {
		super.readData();
		System.out.print("Enter Department : ");
		sc.nextLine();
		department = sc.nextLine();
	}
	
	void printData() {
		super.printData();
		super.printSalary();
		System.out.println("Department : "+department);
	}
}
public class Experiment14 {

	public static void main(String[] args) {
		Officer off = new Officer();
		Manager mgnr = new Manager();
		System.out.println("Enter Details of manager");
		mgnr.readData();
		System.out.println("The Details of manger");
		mgnr.printData();
		System.out.println("\nEnter Details of officer");
		off.readData();
		System.out.println("The Details of officer");
		off.printData();
		
	}

}
