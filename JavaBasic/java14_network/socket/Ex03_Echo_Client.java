package java14_network.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex03_Echo_Client {
	public static void main(String[] args) {
		
//		키보드로 입력한 데이터를 서버로 전송한다
//		서버로부터 돌아온 데이터를 모니터로 출력한다
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Socket sock = null;
		
		// 클라이언트 소켓 생성
		try {
			System.out.println(" >>> 클라이언트 실행 <<< ");
			sock = new Socket("localhost", 10003);
			
			//-------데이터 입력---------
			
			StringBuilder sb = new StringBuilder();
			while( true ) {
				str = sc.nextLine();
				if( "exit".equals(str) ) break;				
				sb.append(str);
				sb.append("\n");
			}
			
			// 데이터 통신
			out = new PrintWriter( new BufferedOutputStream(sock.getOutputStream()), true);
			in = new BufferedReader( new InputStreamReader( sock.getInputStream()));
			
			out.append(sb, 0, sb.length());

			
			int len = -1;
			char[] cbuf = new char[1024];
			while( (len = in.read()) != -1) {
				
				sb.append((char)len);				
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( out != null)	out.close();
				if( in != null)		in.close();
				if( sock != null )	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("클라이언트 종료");
		
		
				
		
		
		
	}

}
