package ch06;

public class ReturnEx {
	//리턴값이 있는 메소드
	
	 static int sum(int a) {
		 int result=0;
		 for(int i =1;i<=a; i++) {
			 result +=i;
			 
		 }//end for
		
		 return result;
	 }
	 
	public static void main(String[] args) {
		int n= sum(50); //method 호출
		System.out.println(n);
		n=sum(100); //다시호출
		System.out.println(n);
	}

}
