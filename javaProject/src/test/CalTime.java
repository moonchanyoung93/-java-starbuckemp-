package test;

public class CalTime {

	public static void main(String[] args) {
		final double A =300000; //km/sec
		final double DISTANCE=40e12;
		double time = DISTANCE / A;
		
		double light_year = time/(60.0*60.0*24.0*365.0);

		System.out.println("걸리는 시간은 " +light_year+"광년입니다.");

	}

}
