package ch14;

public class TypeEx<T> {
	T value;
	
	public void set(T value) {
		this.value=value;
	}
	
	public T get() {
		return value;
	}
	
	public static void main(String[] args) {
		TypeEx<String> id = new TypeEx<String>();
		id.set("moon");
		String i = id.get();
		
		TypeEx<String> name = new TypeEx<String>();
		name.set("문찬영");
		String n = name.get();
		
		TypeEx<String> email = new TypeEx<String>();
		email.set("khm932001@naver.com");
		String e = email.get();
		
		TypeEx<Integer> age = new TypeEx<Integer>();
		age.set(27);
		Integer a = age.get();
		
		TypeEx<String> num = new TypeEx<String>();
		num.set("010-5777-8339");
		String nu = num.get();
		
		System.out.println("id : " + i);
		System.out.println("이름 : " +n);
		System.out.println("이메일 : " +e);
		System.out.println("나이 : "+a);
		System.out.println("전화번호 : " + nu);
		
	}
	

}
