package test10;

interface Operator {
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);

}

public class AutoCar implements Operator{
	public void start() {
		System.out.println("출발");
	}
	
	public void stop() {
		System.out.println("정지");
		
	}
	
	public void setSpeed(int speed) {
	System.out.println("속력을 "+speed+"변경");
	}
	
	public void turn(int degree) {
		System.out.println("방향을 "+degree+"변경");
	}

	public static void main(String[] args) {
		AutoCar a=new AutoCar();
		a.start();
		a.setSpeed(13);
		a.turn(30);
		a.stop();
	}
}


