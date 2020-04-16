package ch20;

import java.net.URL;

//URL : 도메인 이름, 주소 ex)www.naver.com, ip주소...등등


public class UrlInfo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://sports.news.naver.com/kfootball/news/read.nhn?oid=139&aid=0002120988");
			System.out.println("프로토콜 : "+url.getProtocol());
			System.out.println("포트 : "+url.getPort());
			System.out.println("호스트 : "+url.getHost());
			System.out.println("파일 : "+ url.getFile());
			System.out.println("기타 : " + url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
