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
		
	
//	Ű����� �Է��� ������ �������� ����
//
//	Scanner
//	sock->PrintWriter
		
		Scanner sc = new Scanner(System.in);
		Socket sock = null; //  Ŭ���̾�Ʈ ����
		PrintWriter out = null; // ���� ��� ��Ʈ��
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");
			sock = new Socket("localhost", 10002); // ���� ����
			
			// ���� ���
			
			out = new PrintWriter( new BufferedOutputStream(sock.getOutputStream()) , true);
			
			System.out.print("������ ���� �Է°� : ");
			while(true) {
				String str = sc.nextLine();
				if( "/exit".equals(str)) break;
				out.println(str);
			}
			
			
		} catch (UnknownHostException e) {
			// �߸��� ȣ��Ʈ
			e.printStackTrace();
		} catch (IOException e) {
			// ���� ���� ����
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
