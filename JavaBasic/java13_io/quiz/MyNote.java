package java13_io.quiz;

import java.io.File;
import java.util.Scanner;

public class MyNote {
	private final static Scanner sc = new Scanner(System.in);
	
	public MyNote() {}
	
	public void fileSave() {
		System.out.println("���Ͽ� ������ ������ �Է��Ͻÿ�");
		
		String str = null;
		
		do {
		
		StringBuilder sb = new StringBuilder();
		str = sc.nextLine();
		sb.append( str );
		
		} while( !"exit".equals(str) );
		
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
		
		String yn = sc.nextLine();
		
		if( "Y".equals( yn ) || "y".equals( yn )) {
			System.out.print("������ ���ϸ� : ");
			String filename = sc.nextLine();
			
			File file = new File("./src/java13_io/note/", filename);
			
				
			
			
			
			
			
		} else if( ) {
			
		} else {
			
		}
		
		
	}
	
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
		
	}
	

}
