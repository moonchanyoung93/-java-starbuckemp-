package test10;

public class CarTest {
	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		
		if(firstCar.equals(secondCar)) {
			System.out.println("같은 종류");
			
		}else
			System.out.println("다른종류");
	}

}
