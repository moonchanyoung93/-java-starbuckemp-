package ch03;
//자료형변환
public class Cast {

	public static void main(String[] args) {
		float f = 1.6f; //4바이트로 저장
		System.out.println(f);
		
		f = 100F; //작은값 -->큰값 (자동형변환 , auto casting)
		System.out.println(f);
		
		f = 100.5f;
		
		int i = (int)f;//큰값에서 작은값으로 변환할시에는 (int)로 강제형변환(명시적형변환)을 해야한다
		
		System.out.println(i); //소수점 이하는 손실됨
		
		i=300;
		
		byte b = (byte)i;
		
		System.out.println(b);
		

	}

}
