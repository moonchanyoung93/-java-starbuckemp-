package ch20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class GuguServer implements Runnable{
	private ServerSocket serverSocket;//서비스용 소켓
	private Socket socket; // 클라이언트와의 통신용 소켓
	private DataInputStream dis;//입력 스트림(클라이언트의 입력값)
	private DataOutputStream dos; //출력 스트림 (클라이언트에 전송)

	public GuguServer() {
		try {
			//서빗 제공을 위한 소켓 생성, 9999번 포트 할당
			serverSocket = new ServerSocket(9999);
			System.out.println("구구단 서비스가 시작되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();

		}
		while(true) {
			try {
				//클라이언트의 접속을 기다림 =>접속 =>소켓생성(연결)
				socket =serverSocket.accept();
				InetAddress ip= socket.getInetAddress();
				System.out.println("클라이언트의 ip : "+ip);

				//getInputStream() getOutputStream() 입출력을 위한 스트림
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());

				//구구단 계산을 위한 백그라운드 스레드 생성, 
				//서버나 클라이언트가 각자 요구와 응답지연시간동안 다른 일을 할 수 있도록 해준다.
				Thread th = new Thread(this);
				th.start();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new GuguServer();
	}
	@Override
	public void run() {
		try {
			while(true) {
				//클라이언트가 전송한 콤보박스의 값을 숫자로 읽음
				int dan = dis.readInt();//클라이언트가 입력한 dan
				System.out.println("클라이언트의 요청값 : "+dan);
				//구구단 계산 결과를 StringBuilder에 저장하여 클라이언트에게 전송
				StringBuilder sb=new StringBuilder();
				for(int i=1;i<=9;i++) {
					sb.append(dan+"x"+i+"="+dan*i+"\r\n");
				}
				//결과값을 클라이언트에게 보냄
				dos.writeUTF(sb.toString());//writeUTF()는 인코딩까지 처리해준다.
			}

		} catch (Exception e) {
			System.out.println("클라이언트가 접속을 끊었습니다.");
			
		}

	}

}
