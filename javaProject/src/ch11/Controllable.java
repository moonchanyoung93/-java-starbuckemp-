package ch11;

public interface Controllable {
	default void repair() {//명시적 default 메소드로의 구현은 jdk8.0버젼 이상부터 가능!
		System.out.println("장비를 수리한다.");
		
	}
	
	static void reset() {//명시적 static 메소드로의 구현 가능!!!
		System.out.println("장비를 초기화한다.");
	}
	//참고 : 명시적 private 메소드로의 구현은 jdk9.0부터 가능합니다.
	//실무에서는 아직 인터페이스에서 구현메소드를 사용안합니다.!
	
	
	void turnOn();
	void turnOff();
	

}
