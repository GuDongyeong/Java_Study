package java13_io.filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_01 {
	public static void main(String[] args) {
		
		File source = new File( "./src/java13_io/file/", "Source.txt");
		System.out.println( "[TEST] Source exists : " + source.exists());
		File dext = new File( "./src/java13_io/file/", "Dext.txt");
		System.out.println( "[TEST] Dext exists : " + dext.exists());
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int len = -1;
		
		byte[] b = new byte[1024];
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		try {
			fis = new FileInputStream(source);
			
			while( (len = fis.read(b)) != -1 ) {
				str = new String(b, 0, len);
				len++;
			}
			
			
			fos = new FileOutputStream(dext, true);
			fos.write( str.getBytes(), 0, str.length());
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일을 찾을 수 없음");
		} catch (IOException e) {
			System.out.println("[ERROR] 파일스트림 생성 실패");
		} finally {
			try {
				if( fis != null)	fis.close();
				if( fos != null)fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
