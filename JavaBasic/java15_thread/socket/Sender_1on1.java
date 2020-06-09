package java15_thread.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_1on1 extends Thread {
	
	// ��ż���
	private Socket sock;
	
	// Ű���� �Է�
	private BufferedReader reader = null;
	
	// ���� ���
	private PrintWriter writer = null;
	
	public Sender_1on1(Socket sock) {
		this.sock = sock;
	}
	
	@Override
	public void run() {
		System.out.println("--- ä�� ���� ---");
		
		try {
			reader = new BufferedReader( new InputStreamReader( System.in ));
			writer = new PrintWriter( new BufferedOutputStream( sock.getOutputStream()), true);
			
			String str = null;
		
			while( (str = reader.readLine()) != null ) {
				
				if( "/EXIT".equals(str) ) {
					break;
				}
				
				writer.println(str);
			}
			
			System.out.println("--- ä�� ���� ---");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( reader != null )	reader.close();
				if( writer != null )	writer.close();
				if( sock != null)		sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("- - - ���� ���� - - -");
		
		
	}

}
