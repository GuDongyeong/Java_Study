package java12_exception;

public class Exception_05_MultiCatch {
	public static void main(String[] args) {
		
		try {
			
		}catch( NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻�����");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
