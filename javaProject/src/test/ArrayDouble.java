package test;

public class ArrayDouble {

	public static void main(String[] args) {
		double[] dou = {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
		double sum=0;
		for(int i=0; i<dou.length ; i++) {
			System.out.print(dou[i] +"  ");
		}
		for (int i=0; i<dou.length; i++) {
			sum +=dou[i];
		}
		System.out.println();
		System.out.println(sum);
		

	}

}
