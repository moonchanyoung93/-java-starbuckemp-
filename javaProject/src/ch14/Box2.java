package ch14;

public class Box2<T> {//<T>는 타입매개변수가 된다. 다른문자 가능!
	
	private T data;
	public void set(T data) {
		this.data = data;
		
	}
	public T get() {
		return data;
		
	}
	public static void main(String[] args) {
		Box2<String> b = new Box2<String>();//타입매개변수에 대입하게 될 String 지정
		b.set("hello World!");//문자열
		String s = b.get();//좌:String 우:String
		
		Box2<Integer> c = new Box2<Integer>();//타입매개변수에 대입하게 될 Integer 지정
		c.set(100);
		Integer i = c.get();//좌: Integer 우 : Integer
		
		System.out.println(s);
		System.out.println(i);
	}

}
