package java13_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// class File
		//	���� ������ �ٷ�� Ŭ����
		//  ������ ����´������ ����� �� �ֵ��� ���ش�
		
//		File file1 = new File("������ ���", "������ �̸�");
		File file1 = new File("D:/file/", "test.txt");
		// ���� ����� ��� /���ᵵ ����
		
		System.out.println("file1 : " + file1); // ������ ���, �̸�
		System.out.println("length : " + file1.length()); //������ ����
		System.out.println("exists : " + file1.exists()); // ������ �����ϴ��� - ���� ������ ��θ� �����س��� ����

		System.out.println("----------------------------");
	
		File file2 = new File("D:/file/", "file.txt");
		// ���� ����� ��� /���ᵵ ����
		
		System.out.println("file2 : " + file2); // ������ ���, �̸�
		System.out.println("length : " + file2.length()); //������ ����
		System.out.println("exists : " + file2.exists());
	
	
	
	
	}
	

}
