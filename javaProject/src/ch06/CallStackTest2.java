package ch06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod(); //ctrl+1 단축키하면 메소드 생김
		System.out.println("main(String[] args)가 끝났음");
	}

	private static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음.");
		scondMethod();
		System.out.println("firstMethod()가 끝났음");
	}

	private static void scondMethod() {
		System.out.println("secondMethod()가 시작되었음");
		System.out.println("secondMethod()가 끝났음.");

	}
}
