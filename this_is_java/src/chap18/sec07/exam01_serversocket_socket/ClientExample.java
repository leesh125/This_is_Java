package chap18.sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();// 클라이언트 소켓 생성
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));// 서버에 연결 요청
			System.out.println("[연결 성공]");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		if(!socket.isClosed()) {// 연결이 되어 있을 경우
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
