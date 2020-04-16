package test;

public class GetMin {

	public static void main(String[] args) {
		int[] s = {15,8,36,7,1,6,8,74,8754,};
		
		int min;
		min=s[0];
		
		for(int i=0; i<s.length;i++) {
			if(s[i]<min) {
				min=s[i];
			}
			
		}
		System.out.println("최소값은 : " + min);
		
	}

}
