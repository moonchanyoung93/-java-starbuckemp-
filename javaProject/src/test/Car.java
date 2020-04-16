package test;

public class Car {
	String color;
	int gear;
	int speed;
	
	void changGear(int g) {
		gear = g;
		
	}
	
	void speedUp() {
		speed=speed+10;
	}
	
	void speedDown() {
		speed = speed-10;
	}
	
	
	void print() {
		System.out.println("Car [color = "+color+", speed = " +speed+ ", gear = " +gear+"]");
		
	}
	
}
