package test;

public class AnonymousArray {

	public static void main(String[] args) {
System.out.println("숫자들의 합 : " + sum(new int[] {1,2,3,4}));

}

	public static int sum(int[] number) {
		int tot = 0;
		for(int i=0; i<number.length;i++) {
			tot +=number[i];
			
		}
		return tot;
		
	}
}
