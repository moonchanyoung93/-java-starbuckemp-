package ch16;

public class Atm extends Thread {
	private long depositMoney =90300;//예금잔액 10만원
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			withDraw(10000);//1만원 인출
		}
	}

	public void withDraw(int money) {
		String name=Thread.currentThread().getName();
		if(depositMoney > 0) {//잔액이 있으면
			depositMoney = depositMoney - money;
			System.out.println(name+"-잔액"+depositMoney);
			
		}else {
			System.out.println(name+"-잔액이 없습니다.");
		}
	}

}
