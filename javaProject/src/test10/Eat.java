package test10;
class Eating{
	void print() {
		System.out.println("동물이 밥먹는다");
	}
}
class Dog extends Eating{
	void print() {
		System.out.println("강아지가 밥을 먹는다");
	}
}

public class Eat {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.print();

	}

}
