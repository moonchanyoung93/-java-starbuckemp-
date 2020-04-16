package ch19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		String str="";
		BufferedReader reader = null;
		BufferedWriter writer=null;
		
		String file1="c:\\test\\a.txt";//원본
		String file2="c:\\test\\b.txt";//복사본
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str = reader.readLine();
				if(str==null)break;//내용이 없으면 종료
				writer.write(str+"\r\n");// \r : carriage return(캐리지 리턴)
				// \n : new line
				}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) {
					reader.close();//리소스 개별적 닫기
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) {
					writer.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();

			}
		}
				
	}

}
