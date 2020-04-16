package ch13;

public class Change {//값을 교환하는 예제
	public static void main(String[] args) {
		int a =5;//콜라컵
		int b =15;//사이다컵
		int temp;//b의 값을 a에 바로 넣기 전 미리 백업하여 거처가는 임시 변수!
		

		System.out.println(a);
		System.out.println(b);
		
		temp=a; //콜라->빈컵
		a=b;//콜라컵->사이다넣기
		b=temp;//콜라가 있는 빈컵의 내용을 -->사이다 컵에  넣는다
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(temp);
		
	}

}
