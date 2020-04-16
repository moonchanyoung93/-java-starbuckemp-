package ch05;

public class StringArray2 {

	public static void main(String[] args) {
		String[] str = {"Java","DB","JSP","Android"};
		//for(int i=0; i<str.length;i++) {
			//System.out.println(str[i]);
		//}		
		
		//향상된 for문(jdk1.5 ver이상)
		//for(개별값 저장변수 : 집합변수)
		//집합변수의 모든값을 반복처리
		for(String ss : str) {
			System.out.println(ss);
		}

	}

}
