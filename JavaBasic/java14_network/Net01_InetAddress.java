package java14_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		InetAddress ip = null; // IP�ּ� ǥ�� ��ü
		
		try {
			// ������ ����(host)�� ���� IP�ּ� ���
			ip = InetAddress.getByName("www.iei.co.kr");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("[ERROR] �� �� ���� �������ּ� �Դϴ�");
		}
		
		// ȣ��Ʈ���� : ������ �����ϱ� ���� ������ �̸�, ������ ������ �̸�
		// �����γ��� : ȣ��Ʈ������ �������� IP�� ������ �̸�, ������ ��
		
		// ȣ��Ʈ ���� ��ȯ
		System.out.println("HostName : " + ip.getHostName());
		
		// ȣ��Ʈ�� IP �ּҸ� ��ȯ
		System.out.println("HostAddress : " + ip.getHostAddress());
		
		System.out.println("----------------------------------------");
		
		try {
			// ���� ȣ��Ʈ(�ڱ��ڽ�)�� IP������ ����
			ip = InetAddress.getLocalHost();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// ȣ��Ʈ ���� ��ȯ
		System.out.println("HostName : " + ip.getHostName());
		
		// ȣ��Ʈ�� IP �ּҸ� ��ȯ
		System.out.println("HostAddress : " + ip.getHostAddress());
	
		System.out.println("------------------------------");
		
		// IP�ּҸ� byte�迭�� ��ȯ -> -127~128??
		byte[] ipAddr = ip.getAddress();
		
		System.out.println( Arrays.toString(ipAddr));
		
		// ������ byte�迭�� IP�������� ��ȯ
		for(int i=0;i<ipAddr.length;i++) {
			if( ipAddr[i] < 0 ) {
				System.out.println(ipAddr[i] + 256);
			}else {
				System.out.println(ipAddr[i]);
			}
		}
		
	}

}
