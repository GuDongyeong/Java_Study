package java13_io.file;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		
		// class File�� ������
		
		//		File(String path, String filename); -> ��õ
		
		//		File(File path, String filename); File ��ü���� ������ �� �� �ִ�. 
		
		//		File(String filepath)
		
		File file1 = new File("./src/java13_io/file/", "Hello");
		File file2 = new File("./src/java13_io/file/Hello");
		System.out.println( "���丮�ΰ�? "+ file2.isDirectory()); //��������
		
	}

}
