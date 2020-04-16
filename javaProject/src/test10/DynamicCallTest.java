package test10;
class Animals{
	void sound() {
		System.out.println("Animal 클래스의 sound()");
	}
}

class Dogs extends Animals{
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animals{
	void sound() {
		System.out.println("냐옹");
	}
}

public class DynamicCallTest {
	public static void main(String[] args) {
		Animals animal = new Animals();
		Dogs dog = new Dogs();
		Catt cat=new Catt();
		
		
		Animals obj;
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();
	}

}
