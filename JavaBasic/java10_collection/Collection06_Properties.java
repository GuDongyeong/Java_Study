package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection06_Properties {
	public static void main(String[] args) {
		
		Properties prop = new Properties(); // Properties 객체
		
		try {
			
			// 파일 -> Properties로 정보 불러오기
			prop.load( new FileReader("./src/java10_collection/user.properties") ); // 파일 경로(File Path) 파일을 프로퍼티스가 읽어올 수 있도록 지정, FileReader 파일을 가져오는 클래스?
			
			System.out.println( prop );
			
			System.out.println("--------------------");
			
			// 속성 값 가져오기
			
			String user = prop.getProperty("username");
			System.out.println("USER : " + user);
			String pass = prop.getProperty("password");
			System.out.println("PASS : " + pass);
			
			// 인증, Authentication, Auth
			if( "abc".equals(user) && "123".equals(pass) ) {
				System.out.println("로그인에 성공하셨습니다");
			} else {
				System.out.println("로그인에 실패하셨습니다");
			}
			
			
			//--------------------------------------------

			user = "abc";
			pass = "123";
			
			prop.setProperty("username", user);
			prop.setProperty("password", pass);
			
			System.out.println( prop );
			
			// Properties 정보 -> 파일 기록
			prop.store( new FileWriter("./src/java10_collection/user.properties"), "user information" );
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		// ./ 현재 위치(폴더)를 나타내는 경로	
		// 자바 프로그램은 현재 위치를 클래스패스(Class Path)로 제공한다.
		
		// Class Path : 프로그램이 실행된 위치 -> 프로젝트 폴더
		// D:\workspace\JavaBasic\src/java10_collection/user.properties
		
		// 시스템 정보 Properties 얻기
		Properties sysProp = System.getProperties(); // 시스템이 가지고 있는 옵션 정보를 제공
		
		System.out.println("\n --- 자바 버전 ---");
		System.out.println( sysProp.getProperty("java.version"));
		
		
		System.out.println("\n --- OS 이름 ---");
		System.out.println( sysProp.getProperty("os.name"));
				
		System.out.println("\n --- 사용자 계정 ---");
		System.out.println( sysProp.getProperty("user.name"));
		
		System.out.println("\n--------------------");
		System.out.println( sysProp );
		
		
		
		
	}

}
