package java14_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_InputDataServer {
	public static void main(String[] args) {
		
	
//	소켓으로 받은 내용을 모니터로 출력
//
//	sock->BufferedReader
//	System.out

		// 서버 리슨 소켓
		// 서버 통신 소켓
		// 소켓 입출력 스트림
		
		ServerSocket servSock = null;
		Socket sock = null;
		BufferedReader in = null;
		String msg = null;
		
		try {
			servSock = new ServerSocket(10002); // 리슨 소켓 생성
			System.out.println("+ + + 서버 소켓 생성 + + +");
			System.out.println();
			System.out.println("--- 클라이언트 접속 대기중 ---");
			System.out.println("Listen Port : " + servSock.getLocalPort());// 리슨 소켓의 포트 번호
			System.out.println("------------------------------");
			sock = servSock.accept(); // 클라이언트가 접속하면 생성될 통신소켓
			
			//-------입력대기, Blocked--------
			
			//-----클라이언트 접속----
			//-----접속 정보 확인-----
			
			System.out.println("------ 클라이언트 접속 ------");
			InetAddress ip = sock.getInetAddress();
			System.out.println("  >> 클라이언트 IP : " + ip.getHostAddress());
			System.out.println("  >> 클라이언트 Port : " + sock.getPort());
			System.out.println("-----------------------------");
			
			// ----데이터 통신--------
			in = new BufferedReader( new InputStreamReader( sock.getInputStream()));
			
			while((msg=in.readLine()) != null) {
				System.out.println("Message : " + msg);
			}
			
			
		} catch (IOException e) {
			// 서버 리슨 소켓 생성실패
			// acceot() 실패 -> 통신 소켓 생성 실패
			e.printStackTrace();
		} finally {
			try {
				if( in != null )	in.close();
				if( sock != null )	sock.close();
				if( servSock != null )	servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
