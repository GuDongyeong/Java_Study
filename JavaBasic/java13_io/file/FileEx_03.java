package java13_io.file;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		
		// class File의 생성자
		
		//		File(String path, String filename); -> 추천
		
		//		File(File path, String filename); File 객체에는 폴더도 들어갈 수 있다. 
		
		//		File(String filepath)
		
		File file1 = new File("./src/java13_io/file/", "Hello");
		File file2 = new File("./src/java13_io/file/Hello");
		System.out.println( "디렉토리인가? "+ file2.isDirectory()); //폴더인지
		
	}

}
