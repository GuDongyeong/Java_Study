package java14_network.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_Echo_Server {
	public static void main(String[] args) {
		
//		클라이언트가 전달한 데이터를 다시 클라이언트로 출력한다
		
		ServerSocket servSock = null;
		Socket sock = null;
		BufferedReader in = null;
		PrintWriter out = null;
		String str = null;
		
		try {
			// 리슨 소켓 생성
			servSock = new ServerSocket(10003);
			System.out.println(" >>> 서버 소켓 생성 <<<");
			System.out.println();
			System.out.println("--- 클라이언트 접속 대기 중 ---");
			System.out.println("Local Port : " + servSock.getLocalPort());
			System.out.println("-------------------------------");
			
			// 클라이언트 접속 시 통신 소켓 반환
			sock = servSock.accept();
			
			// 접속 정보 확인
			InetAddress ip = sock.getInetAddress(); // 클라이언트 IP 정보 
			System.out.println("--- 클라이언트 접속 확인!!! ---");
			System.out.println("Client IP : " + ip.getHostAddress() );
			System.out.println("Clinet Port : " + sock.getPort());
			System.out.println("-------------------------------");

			// 데이터 통신
			StringBuilder sb = new StringBuilder();
			in = new BufferedReader( new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(new BufferedOutputStream(sock.getOutputStream()), true);
			
			int len = -1;
			char[] cbuf = new char[1024];
			while( (len = in.read()) != -1) {
				
				sb.append((char)len);				
			}
			
			System.out.println("클라이언트에서 받은 데이터 : " + sb);
			
			out.append(sb, 0, sb.length());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( out != null )	out.close();
				if( in != null )	in.close();
				if( sock != null )	sock.close();
				if( servSock != null )	servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
