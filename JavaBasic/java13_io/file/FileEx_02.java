package java13_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		File file1 = new File("D:\\workspace\\JavaBasic\\src\\java13_io\\file", "Hello");
		// D����̺� : root directory �ֻ��� ����
		// ���� ��� �̿�
		//  ��Ʈ ���丮�κ��� ���ϱ��� ��� ��θ� �� ���� ��
		//	ȯ���� �ٲ�� �� �� ����
		
		
		System.out.println("file1 : " + file1); // ������ ���, �̸�
		System.out.println("length : " + file1.length()); //������ ����
		System.out.println("exists : " + file1.exists()); // ������ �����ϴ��� - ���� ������ ��θ� �����س��� ����
		
		System.out.println("-----------------------------------------");
	
		File file2 = new File("./src/java13_io/file", "Hello");
		// ��� ��� �̿� - ���α׷����� �� ����η�
		//  Ŭ�����н�(Classpath)�κ��� ���ϱ��� ��θ� ���� ��
		
		// ** Ŭ���� �н�, ClassPath
		//		���α׷��� ����� ��ġ
		
		//	��Ŭ���������� ������Ʈ ������ Ŭ�����н�(����� ��ġ)�� ����Ǿ� �ִ�.
		
		System.out.println("file2 : " + file2); // ������ ���, �̸�
		System.out.println("length : " + file2.length()); //������ ����
		System.out.println("exists : " + file2.exists()); // ������ �����ϴ��� - ���� ������ ��θ� �����س��� ����
	
		// ��� ��� ���� ����
		
		// . -> ���� ���丮
		
		// .. -> �θ� ���丮 (�Ѵܰ� ���� ����)
		
		// / -> ��Ʈ ���丮
		
		// ex) /test/folder		-> D:\test\folder\
		
		// ex) ./test			-> ���α׷� ���� ����/test
		
		// ex) D:/test/folder/../myfolder	-> D:\test\myfolder
		
		
		
	}

}
