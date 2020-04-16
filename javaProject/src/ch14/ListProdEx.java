package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	
	static void print(Map map) {
		ArrayList<ProdEx> listt = (ArrayList<ProdEx>)map.get("list1");
		
		for(ProdEx p : listt) {
			System.out.println(p.getName()+"\t"+ p.getNum()+"\t"+p.getMenu()+"\t"
		+p.getPrice()+"\t"+p.getAmount()+"\t"+p.getMoney());
			
		}
	}
	

	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<>();
		List<ProdEx> list = new ArrayList<>();
		list.add(new ProdEx("OFEDTV", "lg01tv", "LG", 300,10));
		list.add(new ProdEx("냉장고", "sm02re", "삼성", 200, 5));
		list.add(new ProdEx("에어콘", "win03", "위니아", 100, 8));
		list.add(new ProdEx("컴퓨터", "asus1", "아수스", 200, 6));
		m.put("list1", list);
		System.out.println("                                                                                    (단위 : 만원)");
		System.out.println("---------------------------------------");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("---------------------------------------");
		print(m);
		System.out.println("---------------------------------------");
		

	}

}