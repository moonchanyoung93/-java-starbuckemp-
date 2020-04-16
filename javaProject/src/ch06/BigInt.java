package ch06;

import java.math.BigInteger;

public class BigInt {

	//큰수를 다루기 위해BigInteger를 씀

	static BigInteger factorial(int n) {
		BigInteger fac=BigInteger.ONE;// ONE은 1을 의미합니다! 그렇다고 1을 하면 안됨
		for(int i=1; i<=n; i++) {
			fac=fac.multiply(BigInteger.valueOf(i));//객체로 바꿔주는 작업
			

		}
return fac;
	}//end factorial()
	

	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {
			System.out.println(i+"! = " +factorial(i));
			System.out.println();//줄바꿈
			
		}

	}

}
