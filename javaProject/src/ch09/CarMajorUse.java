package ch09;

class CarMajor{
	int getMajor() {
		return 0;
	}
}

class BMWCar{
	int getMajor() {
		return 300;
	}
}

class BENZCar{
	int getMajor() {
		return 280;
	}
}

class AUDICar{
	int getMajor() {
		return 310;
	}
}



public class CarMajorUse {

	public static void main(String[] args) {
		BMWCar c1 = new BMWCar();
		BENZCar c2 = new BENZCar();
		AUDICar c3 = new AUDICar();

		System.out.println("BMW : " +c1.getMajor()+"km");
		System.out.println("BENZ : " +c2.getMajor()+"km");
		System.out.println("AUDI : " +c3.getMajor()+"km");
	}

}
