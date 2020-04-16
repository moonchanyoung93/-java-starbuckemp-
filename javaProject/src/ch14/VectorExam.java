package ch14;

import java.util.Vector;

/**컬렉션(Collection) - 배열의 단점을 보완한 클래스
배열의 단점 - 사이즈 조절이 안됨, 삽입, 삭제가 어려움, 다양한 자료형을 저장할 수 없다
컬렉션 Map계열 - 순서는 제공되지 않지만 키가 제공됨.(인덱스가 없고 키로 조회)
List계열 - 순서대로 저장, 키가 없음(인덱스로 조회)
Vector대신 요즘 ArrayList를 많이 쓴다.*/


public class VectorExam {
	public static void main(String[] args) {
		//Vector v= new Vector();는 에러는 아니지만 밑에가 정석임.
		Vector<Object> v= new Vector<>();
		/**모든 자료형 처리가능 
		  사이즈가 자동으로 늘어남*/
		System.out.println("초기상이즈 : " +v.capacity());
		/**기본적으로 10개의 사이즈를 만들어 놓는다 
		 * 그길이값을 알아보고 싶을때는 capacity()를 활용한디*/
		v.add("first");
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);

		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		System.out.println("중간 사이즈 : "+v.capacity());//입력된 데이터가 벡터가 만들어 놓은 초기 10개의 사이즈가 넘어가면 또 10개의 사이즈를 추가로 만든다
		System.out.println("데이터의 갯수: " +v.size());//벡터.size() 벡터 요소의 실제 데이터 갯수를 알수있으며, 이는 배열의 length와 같다,
		System.out.println("초기 데이터");
		for(int i=0;i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");//배열[i]처럼 쓰면안됨.
		}

		System.out.println();
		
		v.add(6, 102);//벡터의 인덱스 6번에 데이터 추가
		 for(int i =0; i<v.size(); i++) {
			 System.out.print(v.get(i)+"\t");
		 }
		 
		 System.out.println();//벡터의 인덱스번 요소 삭제
		 v.remove(6);
		 for(int i =0; i<v.size(); i++) {
			 System.out.print(v.get(i)+"\t");
		 }
	}

}
