package ch06;

public class Point {// 성적처리 프로그램
	//전역변수
	static String[] name = {"홍길동", "이몽룡", "이순신","차두리","박지성"};
	static int[] kor = {80,90, 100,60,70};
	static int[] eng = {90,99,77,66,88};
	static int[] math = {80,60,80,90,100};
	static int[] tot = {0,0,0,0,0};
	static double[] avg = {0,0,0,0,0};

	static void getTot() {//총점 계산
		for(int i =0; i<5;i++) {
			tot [i]= kor[i]+eng[i]+math[i];


		}
	}//end getTot()

	static void getAvg() {//평균계산
		for(int i=0;i<5;i++) {
			avg[i] =tot[i]/3;

		}
	}

	static void print() {//결과출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5;i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
	}


	public static void main(String[] args) {
		getTot();
		getAvg();
		print();

	}

}
