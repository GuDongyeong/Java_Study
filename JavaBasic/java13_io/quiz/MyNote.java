package java13_io.quiz;

import java.io.File;
import java.util.Scanner;

public class MyNote {
	private final static Scanner sc = new Scanner(System.in);
	
	public MyNote() {}
	
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하시오");
		
		String str = null;
		
		do {
		
		StringBuilder sb = new StringBuilder();
		str = sc.nextLine();
		sb.append( str );
		
		} while( !"exit".equals(str) );
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		
		String yn = sc.nextLine();
		
		if( "Y".equals( yn ) || "y".equals( yn )) {
			System.out.print("저장할 파일명 : ");
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
