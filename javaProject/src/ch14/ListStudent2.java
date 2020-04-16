package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent2 {

	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2("2017001", "김철수", "Java", 90));
		list.add(new Student2("2016002", "홍길동", "JSP", 80));
		list.add(new Student2("2015003", "사임당", "DB", 70));
		list.add(new Student2("2014004", "이순신", "HTML", 95));
		
		System.out.println("------------------------");
		System.out.println("학번\t이름\t과목\t점수");
		for(Student2 s : list) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getCla()+"\t"+s.getPoint());
		}
		System.out.println("------------------------");


	}

}
