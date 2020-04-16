package ch05;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] name = {"홍길동","이몽룡", "성춘향"};
		int [] j = {100,80,70};
		int [] d = {80,90,95};
		int [] h = {99,89,79};
		int [] js = {85,92,88};
		
		int [] tot = {0,0,0};
		double [] avg = new double [3];
		double tot_avg =0;
		
		for(int i= 0; i<3;i++) {
			tot[i]= j[i]+d[i]+h[i]+js[i];
			avg[i]= tot[i]/4.0;
			tot_avg = tot_avg+avg[i];
			}
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"\t" +j[i]+ "\t" +d[i]+"\t"+h[i]+"\t" +js[i]+"\t"+tot[i] +"\t" +String.format("%4.1f",avg[i]));
		}
		System.out.println("학급평균 : "+String.format("%4.1f",tot_avg/3));
	}

}
