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
		
//		Ŭ���̾�Ʈ�� ������ �����͸� �ٽ� Ŭ���̾�Ʈ�� ����Ѵ�
		
		ServerSocket servSock = null;
		Socket sock = null;
		BufferedReader in = null;
		PrintWriter out = null;
		String str = null;
		
		try {
			// ���� ���� ����
			servSock = new ServerSocket(10003);
			System.out.println(" >>> ���� ���� ���� <<<");
			System.out.println();
			System.out.println("--- Ŭ���̾�Ʈ ���� ��� �� ---");
			System.out.println("Local Port : " + servSock.getLocalPort());
			System.out.println("-------------------------------");
			
			// Ŭ���̾�Ʈ ���� �� ��� ���� ��ȯ
			sock = servSock.accept();
			
			// ���� ���� Ȯ��
			InetAddress ip = sock.getInetAddress(); // Ŭ���̾�Ʈ IP ���� 
			System.out.println("--- Ŭ���̾�Ʈ ���� Ȯ��!!! ---");
			System.out.println("Client IP : " + ip.getHostAddress() );
			System.out.println("Clinet Port : " + sock.getPort());
			System.out.println("-------------------------------");

			// ������ ���
			StringBuilder sb = new StringBuilder();
			in = new BufferedReader( new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(new BufferedOutputStream(sock.getOutputStream()), true);
			
			int len = -1;
			char[] cbuf = new char[1024];
			while( (len = in.read()) != -1) {
				
				sb.append((char)len);				
			}
			
			System.out.println("Ŭ���̾�Ʈ���� ���� ������ : " + sb);
			
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
