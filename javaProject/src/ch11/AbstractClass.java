package ch11;

public abstract class AbstractClass {//하나라도 abstract(추상메소드)가 있으면 클래스도 abstract해야 합니다.
	
	abstract void method1();//추상메소드(메소드 body가 없고 ;으로 끝난다.)
	
	void method2() {//일반 메소드(완성된 메소드)
		System.out.println("완성된 method");
		
	}

}
