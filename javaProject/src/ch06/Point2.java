package ch06;

public class Point2 {//성적처리 프로그램
	//전역변수 
	static String[] name= {"홍길동", "이순신", "김유신"};
	static int [] j= {80,89,90};
	static int [] d= {90,99,80};
	static int [] h = {80,88,70};
	static int [] js= {78,92,100};
	static int [] tot = new int[3];
	static double [] avg = new double[3];
	
	static void getTot() {
		for(int i=0; i<3;i++) {
			tot[i] = j[i]+ d[i]+h[i]+js[i];
		}
	}
	
	static void getAvg() {
		for(int i=0; i<3;i++) {
			avg[i] =tot[i]/4;
		}
	}
	
	static void print() {
		System.out.println("==============================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("==============================================");
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"\t"+j[i]+"\t"+d[i]+"\t"+h[i]+"\t"+js[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
		System.out.println("==============================================");
	}

	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}

}
