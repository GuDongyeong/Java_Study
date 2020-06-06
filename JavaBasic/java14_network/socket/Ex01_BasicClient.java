package java14_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex01_BasicClient {
	public static void main(String[] args) {
		
		Socket sock = null; // Ŭ���̾�Ʈ ����
		BufferedReader in = null; // ���� �Է� ��Ʈ��
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			sock = new Socket("192.168.20.18", 10001);// ���� ����
			
			// ------ ������ ��� --------
			// sock���� ����½�Ʈ���� ��� ���
			
			in = new BufferedReader( new InputStreamReader(sock.getInputStream()));
			
			String msg = in.readLine(); // ������ �б�
			
			System.out.println();
			System.out.println("\t>> ���۵����� : " + msg);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ڿ� ����
			try {
				if(in != null)	in.close();
				if(sock != null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
