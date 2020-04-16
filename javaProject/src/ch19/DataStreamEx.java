package ch19;
// 텍스트파일이 아닌 binary File(이진파일)로 저장

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {
	public static void main(String[] args) throws IOException {
		/**윈도우즈 : \
		 * 리눅스 : /, 드라이브가 없고 디렉토리만 있다.   */

		try {
			//저장
			DataOutputStream dataout=new DataOutputStream(new FileOutputStream("d:\\test.dat"));
			dataout.writeInt(123);//숫자형식의 자료를 파일 저장
			dataout.writeChar('A');//문자형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);//실수 형식의 자료를 저장
			dataout.close();//스트림 닫기(파일이 완성됨)
			System.out.println("저장!");
			
			//읽기
			DataInputStream datain = new DataInputStream(new FileInputStream("d:\\test.dat"));
			
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
