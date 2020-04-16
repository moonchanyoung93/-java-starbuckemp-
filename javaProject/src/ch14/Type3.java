package ch14;

public class Type3<T> {
	T value;
	public void set(T value) {
		this.value=value;
	}
	
	public T get() {
		return value;
	}
	
	public static void main(String[] args) {
		Type3<String> t=new Type3<String>();
		t.set("kim");
		String s = t.get();
		
		Type3<Integer> i = new Type3<Integer>();
		i.set(10);
		Integer num= i.get();
		
		Type3<Double> d = new Type3<Double>();
		d.set(100.5);
		Double num2 = d.get();
		
		System.out.println(s);
		System.out.println(num);
		System.out.println(num2);
	}

}
