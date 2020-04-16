package ch04;

public class SwitchEx {

	public static void main(String[] args) {
		int java=90;
		int html = 85;
		int jsp = 95;
		int db = 75;
		int tot = java+ html+jsp+ db;
		double avg=tot / 4.0;
		String grade = "";
		
		switch((int)(avg/10)){
		case 10:
		case 9 : grade = "수";
		break;
		case 8: grade = "우";
		break;
		
		case 7: grade ="미";
		break;
		case 6 : grade ="양";
		break;
		
		default : grade = "가";
		}//end switch
		
		System.out.println("java\thtml\tjsp\tdb\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.1f\t%s", java, html, jsp, db, tot, avg, grade);

	}

}
