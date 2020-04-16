package ch13;

public class Str {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		
		//대문자로 변경
		System.out.println(str.toUpperCase());
		
		//소문자로 변경
		System.out.println(str.toLowerCase());
		
		System.out.println(str);
		//원본은 바뀌지 않음(immutable, 불변성)
		
		str = str.toLowerCase();//기존 str 주소값은 끊어지고 toLowerCase가 있는 문자열로 새로 연결
		System.out.println(str);
		
		str = "";//빈(null)문자열('\0')을 가리킴
		System.out.println("내용 : "+str);
		str = null;//참조하는 내용이 없음
		System.out.println("내용 : "+str);
		
		char ch='\0'; //널문자
		System.out.println("내용 : "+ch+",code : "+(int)ch);
		ch = ' ';
		System.out.println("내용 : "+ch+",code : "+(int)ch);
	}

}
