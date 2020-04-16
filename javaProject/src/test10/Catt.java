package test10;
class Aanimal{
	public static void eat() {
		System.out.println("Animal의 정적 메소드 eat()");
		
	}
	
	public void soundd() {
		System.out.println("Animal인스턴스 메소드");
		
	}
	
}
public class Catt extends Aanimal{
	
	public static void eat() {
		System.out.println("Cat 정적메소드");
	}
	
	public void soundd() {
		System.out.println("Cat 인스턴스 메소드");
		
	}
	
	public static void main(String[] args) {
		Catt c= new Catt();
		Aanimal a=c;
		Aanimal.eat();
		a.soundd();
	}

}

