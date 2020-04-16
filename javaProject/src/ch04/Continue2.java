package ch04;

public class Continue2 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%2 ==0) continue;//짝수는 continue을 만나 아래 출력문을 건너 뛴다
			System.out.println("홀수값 : " +i);
		}

	}

}
