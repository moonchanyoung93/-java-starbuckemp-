package ch04;
//1~100까지의 합을 구하는 프로그램

public class For_Sum {

	public static void main(String[] args) {
		int total = 0;
		for(int i =1; i<=100; i++) {
			total= total+i;
			if(i%10==0) {
			 	System.out.println("1부터 "+i+"까지의 자연수의 합계는 " +total);
		}//end if 
		
		
       
	}//end for


}//end main
}//end class	
