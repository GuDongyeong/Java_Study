package java14_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {
		
//		String urlStr = "https://docs.oracle.com/javase/8/docs/api/java/net/URL.html"; //��Ʈ��ȣ �����Ƿ� -1
		String urlStr = "https://docs.oracle.com:443/javase/8/docs/api/java/net/URL.html";
		
		URL url = null;
		
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("[ERROR] �߸��� ������ URL�Դϴ�");
		}
		
		System.out.println("�������� : " + url.getProtocol());
		System.out.println("ȣ��Ʈ : " + url.getHost());
		System.out.println("��Ʈ : " + url.getPort());
		System.out.println("���� ��� : " + url.getFile());
		System.out.println("��ü : " + url.toExternalForm());
		
		
	}

}
