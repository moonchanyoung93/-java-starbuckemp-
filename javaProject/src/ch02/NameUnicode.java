package ch02;

public class NameUnicode {

	public static void main(String[] args) {
		char mValue = '\ubb38';
		char cValue = '\ucc2c';
		char yValue = '\uc601';

		System.out.println(mValue + "\t" +cValue + "\t" + yValue);
		System.out.println("char형(\\ubb38'  ) : " + mValue);
		System.out.println("char형(\\ucc2c'  ) : " + cValue);
		System.out.println("char형(\\uc601'  ) : " + yValue);			

	}

}
