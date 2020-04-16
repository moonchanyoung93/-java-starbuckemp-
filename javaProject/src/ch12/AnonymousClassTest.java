package ch12;

interface RemoteControl {
	void turnOn();
	void turnOff();
}
public class AnonymousClassTest {

	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");

			}

			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");

			}
		};//무명내부클래스
		ac.turnOn();
		ac.turnOff();
	}

}
