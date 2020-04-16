package ch05;

public class ArraySum {

	public static void main(String[] args) {
		int []num = {10,20,30,40,50};
		//num[0] = 10, num[1] = 20,......
		int sum =0 ;//배열의 합계를 저장할 일반변수
		
		for(int i =0; i<num.length;i++) { //length속성을 쓰면 배열데이터의 변화가 있더라도 바로 대응!
			sum= sum+num[i];
			
		}
		System.out.println("합계는 "+sum);

	}

}
