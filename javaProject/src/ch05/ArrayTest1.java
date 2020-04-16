package ch05;

public class ArrayTest1 {

	public static void main(String[] args) {
		int [] s = new int[10];//10개의 배열크기를 지정
		for(int i=0; i<s.length;i++) {
			s[i] = i; //배열의 각 index에 생성된 각각의 정수 값을 주입
			System.out.print(s[i]+" ");
		}
		

	}

}
