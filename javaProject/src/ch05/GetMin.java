package ch05;
//최소값 찾기
public class GetMin {

	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,13,4,1,19};
		int minimum;
		
		minimum =s[0];//=12
		for(int i = 1; i<s.length;i++) {
			if(s[i]<minimum)
				minimum=s[i];
			
		}
		System.out.println("최소값은 " + minimum);
	}

}
