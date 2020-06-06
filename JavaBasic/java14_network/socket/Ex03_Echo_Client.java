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
		
//		Ű����� �Է��� �����͸� ������ �����Ѵ�
//		�����κ��� ���ƿ� �����͸� ����ͷ� ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Socket sock = null;
		
		// Ŭ���̾�Ʈ ���� ����
		try {
			System.out.println(" >>> Ŭ���̾�Ʈ ���� <<< ");
			sock = new Socket("localhost", 10003);
			
			//-------������ �Է�---------
			
			StringBuilder sb = new StringBuilder();
			while( true ) {
				str = sc.nextLine();
				if( "exit".equals(str) ) break;				
				sb.append(str);
				sb.append("\n");
			}
			
			// ������ ���
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
		System.out.println("Ŭ���̾�Ʈ ����");
		
		
				
		
		
		
	}

}
