package ch05;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] num;
		num = new int[4];
		num[0]=85;
		num[1]=90;
		num[2]=78;
		num[3]=100;
		
		int sum=0;
		
		for(int i=0; i<4;i++) {
			sum=sum+num[i];
		}
	System.out.println(sum);
}
}
