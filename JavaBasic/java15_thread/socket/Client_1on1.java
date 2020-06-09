package java15_thread.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_1on1 {
	
	public Client_1on1() {
		Socket sock = null;
		try {
			System.out.println("+ + + 클라이언트 시작 + + +");
			sock = new Socket("localhost", 10001);
			chat(sock);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	private void chat(Socket sock) {
		new Sender_1on1(sock).start();
		new Receiver_1on1(sock).start();
	}
	
	public static void main(String[] args) {
		new Client_1on1();
	}

}
