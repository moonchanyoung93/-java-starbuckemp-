package test10;

public class Animal {
	private double weight;
	private String picture;
	
	void eat() {
		System.out.println("eat()가 호출되었음");
		
	}
	
	void sleep() {
		System.out.println("sleep()가 호출되었음");
	}

}

class Lion extends Animal{
	
	private int legs = 4;
	void roar() {
		System.out.println("roar()이 호출되었음");
	}
	
	
}

class Eagle extends Animal{
	private int wings =2;
	
	void fly() {
		System.out.println("fly()가 호출되었음");
	}
}

