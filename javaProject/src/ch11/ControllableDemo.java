package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		TV tv=new TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		Controllable.reset(); //Controllable 클래스의 static 메소드인 reset()클래스이름.메소드로 접근가능합니다.!
		System.out.println("-------------------------");
		System.out.println();

		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		System.out.println("-------------------------");
		System.out.println();

		
		Notebook no=new Notebook();
		no.turnOn();
		no.turnOff();
		no.repair();
		Controllable.reset();



	}

}
