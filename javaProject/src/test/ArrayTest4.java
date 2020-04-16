package test;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] num= {10,20,30};
		int[] list=num;
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]);
		}
		
		
		for(int v :num)
			System.out.print(v +" ");

	}

}
