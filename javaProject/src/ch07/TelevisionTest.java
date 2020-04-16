package ch07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();//Television.java의 객체 생성
		
		tv.channel =7;// tv. = 인스턴스화된 Television의 메모리 주소값으로 접근
		
		tv.volume =9;
		tv.onoff = true;
		System.out.println("텔레비젼의 채널은 " +tv.channel+"이고 볼륨은 " +tv.volume+ "입니당!");
		

	}

}
