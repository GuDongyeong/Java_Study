package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		File file1 = new File("D:\\workspace\\JavaBasic\\src\\java13_io\\file", "Hello");
		// D드라이브 : root directory 최상위 폴더
		// 절대 경로 이용
		//  루트 디렉토리로부터 파일까지 모든 경로를 다 적은 것
		//	환경이 바뀌면 쓸 수 없음
		
		
		System.out.println("file1 : " + file1); // 파일의 경로, 이름
		System.out.println("length : " + file1.length()); //파일의 길이
		System.out.println("exists : " + file1.exists()); // 파일이 존재하는지 - 단지 파일의 경로를 저장해놓는 역할
		
		System.out.println("-----------------------------------------");
	
		File file2 = new File("./src/java13_io/file", "Hello");
		// 상대 경로 이용 - 프로그래밍할 때 상대경로로
		//  클래스패스(Classpath)로부터 파일까지 경로를 적은 것
		
		// ** 클래스 패스, ClassPath
		//		프로그램이 실행된 위치
		
		//	이클립스에서는 프로젝트 폴더가 클래스패스(실행된 위치)로 적용되어 있다.
		
		System.out.println("file2 : " + file2); // 파일의 경로, 이름
		System.out.println("length : " + file2.length()); //파일의 길이
		System.out.println("exists : " + file2.exists()); // 파일이 존재하는지 - 단지 파일의 경로를 저장해놓는 역할
	
		// 상대 경로 지정 문자
		
		// . -> 현재 디렉토리
		
		// .. -> 부모 디렉토리 (한단계 위의 폴더)
		
		// / -> 루트 디렉토리
		
		// ex) /test/folder		-> D:\test\folder\
		
		// ex) ./test			-> 프로그램 실행 폴더/test
		
		// ex) D:/test/folder/../myfolder	-> D:\test\myfolder
		
		
		
	}

}
