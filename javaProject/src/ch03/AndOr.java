package ch03;
//&& ||
public class AndOr {

	public static void main(String[] args) {
		int a= 7;
		System.out.println(a > 5 && a<0); //t && f => false ->두개의 조건 모두가 만족하여야 트루!!

		System.out.println(a>5 || a<0);  // t|| f => true ->둘중 하나만 트루여도 결과값 트루!
		
	}

}
