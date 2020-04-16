package ch14;

public class ProdEx {
	private String name;//제품명
	private String num; //제품번호
	private String menu;//제조사
	private int price;//단가
	private int amount;//수량
	private int money;//판매금액 => 단가x수량으로 계산
	
	
	public ProdEx() {
	}


	public ProdEx(String name, String num, String menu, int price, int amount) {
		this.name = name;
		this.num = num;
		this.menu = menu;
		this.price = price;
		this.amount = amount;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getMoney() {
		return price*amount;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	

}
