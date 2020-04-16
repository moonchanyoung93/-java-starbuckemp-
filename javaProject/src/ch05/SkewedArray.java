package ch05;
//비정방형 배열(가변형, 래그드배열)
//각행의 열의 갯수가 다른 배열

public class SkewedArray {

	public static void main(String[] args) {
		int intArray[][]= new int[4][];
		intArray[0] = new int[3];// 첫째 행의 3개의 열을 생성시키겠다.
		intArray[1] = new int[2];//둘째 행의 2개의 열을 생성시키겠다.
		intArray[2] = new int[3];// 세째 행의 3개의 열을 생성시키겠다.
		intArray[3]= new int[2];//넷째 행의 2개의 열을 생성시키겠다.
		
		for(int i=0; i<intArray.length;i++) {//행에대한 반복
			for(int j=0; j<intArray[i].length; j++) {//열에대한 반복
				intArray[i][j]=(1+i)*10+j;
				
			}
		}
		for (int i = 0; i<intArray.length; i++) {
			for(int j =0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+ " ");
			}
			System.out.println();
		}
				

	}

}
