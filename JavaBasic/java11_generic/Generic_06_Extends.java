package java11_generic;

public class Generic_06_Extends {
	public static void main(String[] args) {
		
		print(123); // T -> Integer
		
		print(23.456); // T -> Double
		
//		print("Apple"); // T -> String // ����	
	}
	
	// ���׸� �޼ҵ�
	public static <T extends Number> void print(T t) { // Number�� �ڽ�Ŭ������ ����ϴ� Ÿ���Ķ����
		System.out.println(t);
	}
	
}
