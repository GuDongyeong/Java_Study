package java14_network.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_InputDataClient {
	public static void main(String[] args) {
		
	
//	키보드로 입력한 내용을 소켓으로 전송
//
//	Scanner
//	sock->PrintWriter
		
		Scanner sc = new Scanner(System.in);
		Socket sock = null; //  클라이언트 소켓
		PrintWriter out = null; // 소켓 출력 스트림
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock = new Socket("localhost", 10002); // 서버 접속
			
			// 소켓 출력
			
			out = new PrintWriter( new BufferedOutputStream(sock.getOutputStream()) , true);
			
			System.out.print("서버에 보낼 입력값 : ");
			while(true) {
				String str = sc.nextLine();
				if( "/exit".equals(str)) break;
				out.println(str);
			}
			
			
		} catch (UnknownHostException e) {
			// 잘못된 호스트
			e.printStackTrace();
		} catch (IOException e) {
			// 소켓 생성 실패
			e.printStackTrace();
		} finally {
			try {
				if( out != null)	out.close();
				if( sock != null )	sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
