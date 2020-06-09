package java15_thread.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {
	
	public Server_1on1() {
		ServerSocket servSock = null;
		try {
			System.out.println("+ + + ���� ���� ���� + + + ");
			servSock = new ServerSocket(10001);
				
				System.out.println("---Ŭ���̾�Ʈ �����---");
				System.out.println("Listen Port : " + servSock.getLocalPort());
				System.out.println("-----------------------");
				Socket sock = servSock.accept();
				System.out.println("\n---Ŭ���̾�Ʈ ����!!---");
				InetAddress ip = sock.getInetAddress();
				System.out.println("Client IP : " + ip.getHostAddress());
				System.out.println("Client Port : " + sock.getPort());
	
				
				chat(sock);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( servSock != null)	servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	private void chat(Socket sock) {

		new Sender_1on1(sock).start();
		new Receiver_1on1(sock).start();
		

	}
	
	public static void main(String[] args) {
		new Server_1on1();
	}

}
