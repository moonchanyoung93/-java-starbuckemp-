package ch03;

public class LogicalOperaror {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 /4;  //자동형변환(작은값에서 큰값을 변환할때)
		System.out.println(f);
		
		f = (double) 5/ 4 ;  
		System.out.println(f);
		
		i = (int)1.3 +(int)1.8; //강제 형변환 (큰값에서 작은값으로 변환할때)
		System.out.println(i);

	}

}
