package ch16;



public class Sync {
	public static void main(String[] args) {
		Atm atm=new Atm();
		//new Thread(스레드구현객체, 스레드이름)
		Thread mom=new Thread(atm, "mom");
		Thread son=new Thread(atm, "son");
		mom.start();
		son.start();
		
	}

}
