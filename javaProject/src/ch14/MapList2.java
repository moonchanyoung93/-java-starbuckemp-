package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList2 {
	static void print (Map m) {
		ArrayList<Student2> listt= (ArrayList<Student2>)m.get("list");
		for(Student2 s: listt) {
		
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getCla()+"\t"+s.getPoint());
			
		}
	}

		public static void main(String[] args) {

			Map<String, Object> map = new HashMap<>();
			List<Student2> list = new ArrayList<>();
			list.add(new Student2("2017001", "김철수", "Java", 90));
			list.add(new Student2("2016002", "홍길동", "JSP", 80));
			list.add(new Student2("2015003", "사임당", "DB", 70));
			list.add(new Student2("2014004", "이순신", "HTML" , 95));
			map.put("list", list);

			System.out.println("----------------------------");
			System.out.println("학번\t이름\t과목\t점수");
			print(map);
			System.out.println("----------------------------");

		}


	}


