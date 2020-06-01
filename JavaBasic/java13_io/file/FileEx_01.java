package java13_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// class File
		//	파일 정보를 다루는 클래스
		//  파일을 입출력대상으로 사용할 수 있도록 해준다
		
//		File file1 = new File("파일의 경로", "파일의 이름");
		File file1 = new File("D:/file/", "test.txt");
		// 파일 경로의 경우 /를써도 가능
		
		System.out.println("file1 : " + file1); // 파일의 경로, 이름
		System.out.println("length : " + file1.length()); //파일의 길이
		System.out.println("exists : " + file1.exists()); // 파일이 존재하는지 - 단지 파일의 경로를 저장해놓는 역할

		System.out.println("----------------------------");
	
		File file2 = new File("D:/file/", "file.txt");
		// 파일 경로의 경우 /를써도 가능
		
		System.out.println("file2 : " + file2); // 파일의 경로, 이름
		System.out.println("length : " + file2.length()); //파일의 길이
		System.out.println("exists : " + file2.exists());
	
	
	
	
	}
	

}
