package ch05;

public class ForeachEx2 {

	public static void main(String[] args) {
		String[] cars = {"BMW", "벤츠", "아우디","현대","기아"};
		System.out.println("자동차 메이커");
		System.out.println("------------------");
		for(String ss : cars) {
			System.out.print(ss+ "  ");
		}
		System.out.println("\n------------------");

	}

}
