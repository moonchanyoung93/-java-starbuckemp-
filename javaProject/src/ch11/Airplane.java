package ch11;

public class Airplane implements Flyer{
	//인터페이스를 상속받을때는 구현(implements)키워드를 써야한다.

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");		
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙");		
	}


}
