package ch03;
 //증감 연산
public class InCrease {

	public static void main(String[] args) {
		int i = 5;
		int j =0;
		j =i++; //i의 값을 1 증가 시킴(나중에 계산)
		System.out.println(i +"," +j); //++가 뒤에 오면 j값에는 영향을 주지않고
		
		i = 5;
		j = ++i; //i의 값을 1 증가(먼저 계산)
		System.out.println(i +"," +j); //++가 앞에 오면 j값에 우선으로 영향을 준다.

	}

}
