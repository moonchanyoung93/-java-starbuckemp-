package ch04;

import java.util.Scanner;

public class SmallProject {

	public static void main(String[] args) {
		int menu =0;
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println(" == 메 뉴 ==");
			System.out.println("(1) 김치찌개");
			System.out.println("(2) 된장찌개");
			System.out.println("(3) 육개장");
			System.out.println("(4) 불고기");
			System.out.print("원하는 메뉴(1~4)를 선택하세요.(종료:0)>");
			menu = scan.nextInt();

			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else if(!(menu>=1 && menu <=4)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				System.out.println();
				continue;

			}
			switch(menu){
			case 1:
				System.out.println("선택하신 메뉴는 1번 김치찌개입니다.");
				break;
			case 2: 
				System.out.println("선택하신 메뉴는 2번 된장찌개입니다.");
				break;
			case 3:
				System.out.println("선택하신 메뉴는 3번 육개장입니다.");
				break;
			case 4 :
				System.out.println("선택하신 메뉴는 4번 불고기입니다.");
			}



System.out.println();
		}
		scan.close();


	}

}
