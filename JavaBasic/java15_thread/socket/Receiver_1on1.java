package java15_thread.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver_1on1 extends Thread{

	private Socket sock;
	
	private BufferedReader reader = null;
	
	private PrintWriter writer = null;
	
	public Receiver_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		// ���� �Է�
		try {
			reader = new BufferedReader(new InputStreamReader( sock.getInputStream()));
			writer = new PrintWriter( new BufferedOutputStream(System.out), true);
			
//			String str = null;
//			while((str=reader.readLine()) != null) {
//				writer.println("���� �޽��� : " + str);
//			}
			
			while(true) {
				
				String msg = reader.readLine();
				
				if( msg == null ) {
					System.out.println("���� ������ ����");
					break;
				}
				writer.println("���� �޽��� : " + msg);
			}
			
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("+ + + ��� ���� + + +");
		} finally {
			try {
				if( reader != null)	reader.close();
				if( writer != null)	writer.close();
				if( sock != null )	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
