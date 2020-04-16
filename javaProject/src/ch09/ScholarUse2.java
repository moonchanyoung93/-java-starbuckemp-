package ch09;

public class ScholarUse2 {

	public static void main(String[] args) {

		Scholar2 s1= new Scholar2();
		s1.input("문찬영", "201202187", "영상", 4, "A+");
		s1.print1();
		
		s1.input("권영훈", "201204175", "불어불문", 4);
		s1.print2();
		
		s1.input("조운영", "201201457");
		s1.print3();
	}

}
