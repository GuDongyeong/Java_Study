package java12_exception;

public class Exception_03_try {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
		
		if( num2 != 0) {
			System.out.println( num1/num2 );
		} else {
			System.out.println("[WARNING] �������� 0�Դϴ�");
		}
		
		System.out.println("----------------------");
		
		try {
			System.out.println(num1/num2); // ���� �߻�, divide by zero
		} catch( ArithmeticException e){
			System.out.println("[WARNING] �������� 0�Դϴ�");
//			e.printStackTrace(); // �������� Ȯ��
		}
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
	}

}
