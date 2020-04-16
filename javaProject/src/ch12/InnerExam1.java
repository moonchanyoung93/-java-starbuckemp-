package ch12;

public class InnerExam1 {//멤버영역 ->메인에 new를 해줘야해
	
	class Cal{//멤버영역의 내부클래스(inner class)
		int value = 0;
		public void plus() {//멤버메소드
			value++;
			
		}//end plus()
	}//end class Cal
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal=t.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
		
		
	}

}
