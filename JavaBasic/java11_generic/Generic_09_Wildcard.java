package java11_generic;

import java.util.Arrays;
import java.util.List;

public class Generic_09_Wildcard {
	
//	public static void display(List<?> list) { //  ? : ���ϵ� ī�� // ������ Ÿ���Ķ���ʹ� ��ӱ����� ���������� ?�� ������ ó������, Ÿ���Ķ������ ��ӱ����� ������ִ� ��
//	public static void display(List<? extends Number> list) { 
	public static void display(List<? super String> list) { 
		
		for( Object o : list) {
			System.out.println( o );
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> iList = Arrays.asList( 10, 20, 30 );
		
		display(iList);
		
		System.out.println("------------------");
		
		List<String> sList = Arrays.asList( "A", "B", "C" );
		
		display(sList);
		
		System.out.println("------------------");
		
		
		Object o = null;
		
		Integer i = null;
		
		o = i; // Object Ŭ������ Integer�� �θ� Ŭ����, �ڵ�����ȯ���� ���� ����
		
		System.out.println("------------------");

		// ���׸�(Ÿ���Ķ����)�� �ڹ��� �⺻ ��ӱ����� �����Ѵ�
		// List List<Object> List<Integer> �� ���� �������� ����
		
		List<Object> ol = null;
		List<Integer> il = null;
		
//		ol = il; // Type mismatch ����
		
		
		
	}

}
