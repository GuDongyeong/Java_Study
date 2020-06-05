package java14_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		InetAddress ip = null; // IP주소 표현 객체
		
		try {
			// 도메인 네임(host)을 통해 IP주소 얻기
			ip = InetAddress.getByName("www.iei.co.kr");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 알 수 없는 도메인주소 입니다");
		}
		
		// 호스트네임 : 노드들을 구분하기 위해 지정한 이름, 개인이 지정한 이름
		// 도메인네임 : 호스트네임의 일종으로 IP와 매핑한 이름, 유일한 값
		
		// 호스트 네임 반환
		System.out.println("HostName : " + ip.getHostName());
		
		// 호스트의 IP 주소를 반환
		System.out.println("HostAddress : " + ip.getHostAddress());
		
		System.out.println("----------------------------------------");
		
		try {
			// 로컬 호스트(자기자신)의 IP정보를 얻어옴
			ip = InetAddress.getLocalHost();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// 호스트 네임 반환
		System.out.println("HostName : " + ip.getHostName());
		
		// 호스트의 IP 주소를 반환
		System.out.println("HostAddress : " + ip.getHostAddress());
	
		System.out.println("------------------------------");
		
		// IP주소를 byte배열로 반환 -> -127~128??
		byte[] ipAddr = ip.getAddress();
		
		System.out.println( Arrays.toString(ipAddr));
		
		// 음수인 byte배열을 IP형식으로 반환
		for(int i=0;i<ipAddr.length;i++) {
			if( ipAddr[i] < 0 ) {
				System.out.println(ipAddr[i] + 256);
			}else {
				System.out.println(ipAddr[i]);
			}
		}
		
	}

}
