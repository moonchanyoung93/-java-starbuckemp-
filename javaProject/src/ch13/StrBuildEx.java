package ch13;

public class StrBuildEx {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("I am a");
		StringBuilder str2 = new StringBuilder();
		str2.append(" Java Programmer");
		
		String end=str1.toString()+str2.toString();
		String end1=end.replace("Java", "JSP");
		String end2=end1.substring(7);
		
		System.out.println("-----------------------------");
		System.out.println("Append()메소드를 활용 : "+end);
		System.out.println("replace()를 활용 : "+end1);
		//System.out.println(end); =>I am a JSP Programmer
		System.out.println("substring()을 활용 : "+end2);
		System.out.println("-----------------------------");
	
	}

}
