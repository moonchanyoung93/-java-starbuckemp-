package ch20;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws MalformedURLException {
		String website="http://img.danawa.com/cp_images/service/33/3608360/b9de2e9f.jpg";
		System.out.println("다운로드를 시작합니다.");
		URL url=new URL(website);//url 생성
		byte[] buffer=new byte[2048];//버퍼용 바이트 배열[2mb]
		//파일로 저장 <=== 프로그램 <=== 서버의 이미지 파일
		
		/**try(리소스){
		 * catch{}
		 * finally{}=>리소스 close().*/
		
		//try ~with문(Java 1.7부터 도입)
		try(InputStream in=url.openStream();
				OutputStream out
				=new FileOutputStream("d:\\test.jpg")){
			int length=0;//length 읽은 바이트수 리턴
			//읽은바이트수=스트림.read(버퍼)
			//더이상 읽을 내용이 없으면 -1
			while((length=in.read(buffer)) != -1) {
				System.out.println(length+"바이트 읽음.");
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
