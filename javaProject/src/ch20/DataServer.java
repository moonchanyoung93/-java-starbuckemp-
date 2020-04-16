package ch20;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//서버용 프로그램
public class DataServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("서비스가 시작되었습니다.");
		while(true) {
			Socket socket = ss.accept();//accept() 클라이언트가 접속할 때까지 대기상태
														//접속하면 소켓에 연결(논리적인 회선 연결)
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			//날짜포맷 yyyy : 4자리 연도, MM월, dd날짜, HH 24시간제, hh 12시간제
			String str = sdf.format(new Date());//영문식의 날짜가 출력
			out.println(str);//클라이언트에게 데이터 전송 출력
			socket.close();//소켓 종료(연결 종료)
		}
		
	}

}
