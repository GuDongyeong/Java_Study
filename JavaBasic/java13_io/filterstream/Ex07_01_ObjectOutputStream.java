package java13_io.filterstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Point implements Serializable { // ����ȭ �����ϵ��� ���
	
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class Ex07_01_ObjectOutputStream {
	public static void main(String[] args) {
		
		// ���� ��ü ����
		File file = new File("./src/java13_io/filterstream/", "ObjectTest.ser"); // Ȯ���� ser : ����ȭ�� ������� ����
		
		// ��Ʈ����ü
		ObjectOutputStream oos = null;
		
		try {
			// ��Ʈ�� ��ü ����
			oos = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream(file) ) );
			
			// ��� ��� ��ü ����
			Point p1 = new Point(11, 22);
			Point p2 = new Point(111, 222);
			Point p3 = new Point(1111, 2222);
			
			// ���
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.flush();
			
		} catch ( FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( oos != null ) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}























