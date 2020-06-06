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
		
	
//	�������� ���� ������ ����ͷ� ���
//
//	sock->BufferedReader
//	System.out

		// ���� ���� ����
		// ���� ��� ����
		// ���� ����� ��Ʈ��
		
		ServerSocket servSock = null;
		Socket sock = null;
		BufferedReader in = null;
		String msg = null;
		
		try {
			servSock = new ServerSocket(10002); // ���� ���� ����
			System.out.println("+ + + ���� ���� ���� + + +");
			System.out.println();
			System.out.println("--- Ŭ���̾�Ʈ ���� ����� ---");
			System.out.println("Listen Port : " + servSock.getLocalPort());// ���� ������ ��Ʈ ��ȣ
			System.out.println("------------------------------");
			sock = servSock.accept(); // Ŭ���̾�Ʈ�� �����ϸ� ������ ��ż���
			
			//-------�Է´��, Blocked--------
			
			//-----Ŭ���̾�Ʈ ����----
			//-----���� ���� Ȯ��-----
			
			System.out.println("------ Ŭ���̾�Ʈ ���� ------");
			InetAddress ip = sock.getInetAddress();
			System.out.println("  >> Ŭ���̾�Ʈ IP : " + ip.getHostAddress());
			System.out.println("  >> Ŭ���̾�Ʈ Port : " + sock.getPort());
			System.out.println("-----------------------------");
			
			// ----������ ���--------
			in = new BufferedReader( new InputStreamReader( sock.getInputStream()));
			
			while((msg=in.readLine()) != null) {
				System.out.println("Message : " + msg);
			}
			
			
		} catch (IOException e) {
			// ���� ���� ���� ��������
			// acceot() ���� -> ��� ���� ���� ����
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
