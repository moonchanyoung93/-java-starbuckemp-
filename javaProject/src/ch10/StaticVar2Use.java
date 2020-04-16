package ch10;

public class StaticVar2Use {
	public static void main(String[] args) {
		//static =>클래스 이름으로 접근, 객체생성 안한다.
		System.out.println(StaticVar2.total);
		StaticVar2 car1 = new StaticVar2("쏘나타");
		StaticVar2 car2 = new StaticVar2("모닝");
		StaticVar2 car3 = new StaticVar2("아반떼");
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);
		//static은 한개만 만들어서 공유해서 쓰게되며, non static같은 경우에는 생성을 할때마다 계속 하나씩 만들어야합니다.
		
	}

}
