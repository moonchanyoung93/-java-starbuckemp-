package ch10;

class K{
	int a =10;
	public void print() {
		System.out.println(a);
	}
}

class V extends K{
	int a =20;
	@Override
	public void print() {//오버라이딩(재정의)
		System.out.println(a);
	}
}
public class Poly {
	public static void main(String[] args) {
		V k=new V();
		k.print();
		
		K t = new K();
		t.print();
		
		K m=new V();//좌:부모, 우: 자식 =>(다형성)
		//V n=new K(); => 좌: 자식, 우: 부모는 에러!
		m.print();
		//다형성을 쓸 때 실제 참조변수가 가르키는 객체가 사용되고자 하는 객체가 맞는지를 검사할때는 instanceof연산자 사용
		System.out.println("m instanceof V? :" + (m instanceof V)) ;
		
	}

}
