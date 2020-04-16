package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str ="kim,20,180,55,서울,학생";//아무기호나 문자로 구분자를 줄수 있지만 주로 ',' , '/' , 'tab' , 으로 데이터를 구분한다. 이를 토큰이라고 한다

		String[] items= str.split(","); //문자열.split("구분자")문자열을 배열로 리턴
		for(String s : items) {
			System.out.println(s);
		}
		
		//StringTokenizer는 String객체의 split()과 같은 메소드들보다 더 다양한 메소드들을 제공받을수 있다
		StringTokenizer st = new StringTokenizer(str,",");
		int cnt = st.countTokens();//토큰의 갯수
		System.out.println("토큰의 갯수 : " +cnt);
		
		while(st.hasMoreElements()) {//다음 요소의 내용이 있으면
			System.out.println(st.nextToken());
		
		}
		
	}

}
