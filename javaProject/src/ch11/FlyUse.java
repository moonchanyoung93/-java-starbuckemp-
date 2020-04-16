package ch11;

public class FlyUse {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		System.out.println();
		
		Airplane air= new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		System.out.println();
		//Or
		
		//★★Flyer a= new Flyer();는 안됨 = 인터페이스는 객체생성이 안되기 때문!
		Flyer f= new Bird();//다형성, 좌:부, 우:자식
		f.takeOff();
		f.fly();
		f.land();
		System.out.println();
		f= new Airplane();
		f.takeOff();
		f.fly();
		f.land();
		
	}
}
