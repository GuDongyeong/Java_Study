package java14_network.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_BasicServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null;  // ��� ����
		
		PrintWriter out = null; // ���� ��� ��Ʈ��
		
		try {
			//-----------���� ���� ���� Ȱ��ȭ-----------------
			servSock = new ServerSocket(10001);// �������� ����, �Ű����� ��Ʈ��ȣ ��Ʈ ������
			System.out.println("+ + + ���� ���� ���� + + +");
			System.out.println();
			System.out.println("--- Ŭ���̾�Ʈ ���� ����� ---");
			System.out.println(" Listen Port : " + servSock.getLocalPort());
			System.out.println("------------------------------");
			// Ŭ���̾�Ʈ�� �����ϸ� ��ſ� ����(Ŭ���̾�Ʈ�� �����)�� ��ȯ�Ѵ�
			sock = servSock.accept(); // ���� ����
			//---------------------------------------------------
			//���� ���� ���� �� Ŭ���̾�Ʈ ����
			
			//--------------�Ͻ� ���� ����, BLOCKED--------------
			
			// -------���� ���� Ȯ�� ---------
			System.out.println("Ŭ���̾�Ʈ ����!");
			InetAddress ip = sock.getInetAddress();// Ŭ���̾�Ʈ IP���� ���
			System.out.println("  >> Ŭ���̾�Ʈ IP : " + ip.getHostAddress());
			System.out.println("  >> Ŭ���̾�Ʈ Port : " + sock.getPort());
			System.out.println("------------------------------");
			
			//--------------------------------
			
			//---------������ ��� ---------
			// ��� ���� sock���� ����� ��Ʈ���� ��� ����Ѵ�
			
			// sock.getInputStream(); // ������ ���� �Է� ��Ʈ��
			// sock.getOutputStream(); // ������ ���� ��� ��Ʈ��
			
			out = new PrintWriter ( sock.getOutputStream(), true);
			out.println("����.....");
			
			
			//--------------------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ڿ�����
			try {
				if(out != null)	out.close();
				if(sock != null)	sock.close();
				if(servSock != null)	servSock.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
