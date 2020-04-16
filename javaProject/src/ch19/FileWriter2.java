package ch19;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWriter2 {
	public static void main(String[] args) {
		OutputStream os= null;
		try {
			os=new FileOutputStream("d:\\test2.txt");
			System.out.println("입력하십시오 : ");
			
			while(true) {
				int c = System.in.read();
				if(c==13)break;//엔터키로 종료
				os.write(c);			
		} System.out.println("저장되었습니다!");
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}

}
