package java12_exception;

public class Exception_06_throw {
	public static void main(String[] args) {
		
//		Exception e = new NullPointerException(); // ���� ��ü ����	throw e; -> Exception�� checked Exception�̹Ƿ� try catch�� �����ϱ� ������ ����üũ, ���� �߻�
		
		// ���ܸ� ���� �߻���Ű�� - throw ���
		
		NullPointerException e = new NullPointerException(); // ���� ��ü ����
		
		try {
			throw e;
		}catch( Exception e1 ) {// �̹� e�� �����Ƿ� e1, e2, ... �� ǥ��
			e1.printStackTrace();
		}
		
		//-------------------------------------------
		
		
//		throw new NullPointerException();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}