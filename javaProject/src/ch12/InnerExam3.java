package ch12;

public class InnerExam3 {
	//↓멤버 메소드↓
	public void exec() {
		
		
		class Cal{//지역중첩클래스,지역(local)클래스
			int value =0;
			public void plus() {
				value++;
			}
			
		}//end class Cal
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
		
		
	}//end exec()메소드
	
	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
	}

}
