/*******************************************************************
 * File  : Experiment
 * Author: Name
 * Date  : DD/MM/YYYY
 *******************************************************************/

abstract class Animal{
	protected int legs;
	protected Animal(int legs){
		this.legs=legs;
	}
	abstract void eat();
	void walk() {
		System.out.println("It walks using "+legs+" legs");
	}
}

class Spider extends Animal{
	Spider(){
		super(8);
	}
	void eat() {
		System.out.println("Spider eats bugs");
	}
}
interface pet{
	abstract String getName();
	abstract void setName(String name);
	abstract void play();
}
class Cat extends Animal implements pet{
	String name;
	Cat(String name){
		super(4);
		this.name = name;
	}
	Cat(){
		this("");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println(this.name+" likes to play with balls");;
	}
	void eat() {
		System.out.println("Cats like to eat fish.");
	}
}
class Fish extends Animal implements pet {
	String name;
	Fish(){
		super(0);	
	}
	void walk() {
		System.out.println("Fish can't walk and don't have legs.");
	}
	void eat() {
		System.out.println("Fish eats plants ");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println(this.name+" likes to play with balls");;
	}
}
public class Experiment6 {
	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		//Animal a = new Fish();
		Spider e = new Spider();
		//Pet p = new Cat();
		 d.walk();
		 d.setName("Dolphin");
		 System.out.println("Fish's name is "+d.getName());
		 d.eat();
		 d.play();
		 System.out.println("Cat's name is "+c.getName());
	     c.play(); 
	     c.eat();
	     e.eat();
	     e.walk();
	     //a.walk();
	}
}
