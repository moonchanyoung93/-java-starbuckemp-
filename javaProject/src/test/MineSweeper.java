package test;

public class MineSweeper {

	public static void main(String[] args) {
		
		boolean[][] board = new boolean[10][10];
		
		for(int i=0; i<10;i++) {
			for (int j=0; j<10;j++) 
				if(Math.random()<0.3) {//난수를 발생시켜서 30%의 확률로 지뢰를 저장한다.
					board[i][j]= true;
		}		
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10;j++)
				if(board[i][j])
					System.out.print("# ");
				else
					System.out.print(". ");
			System.out.println();
		}
		

	}

}
