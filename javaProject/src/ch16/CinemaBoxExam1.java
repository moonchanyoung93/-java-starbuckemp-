package ch16;

public class CinemaBoxExam1 {

	public static void main(String[] args) {
		CinemaBox box = new CinemaBox();
		CinemaPlayer ta = new CinemaPlayer(1, box);
		CinemaPlayer jo = new CinemaPlayer(2, box);
		
		ta.start();
		jo.start();
	}

}
