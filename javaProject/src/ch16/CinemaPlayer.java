package ch16;

public class CinemaPlayer extends Thread {
	int type;
	CinemaBox cinemaBox;
	
	public CinemaPlayer(int type, CinemaBox cinemaBox) {
		this.type = type;
		this.cinemaBox=cinemaBox;
	}
	
	@Override
	public void run() {
		switch(type) {
		case 1 : cinemaBox.playCinemaA();break;
		case 2 : cinemaBox.playCinemaB();break;
		}

	}

}
