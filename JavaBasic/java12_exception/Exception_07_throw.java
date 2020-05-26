package java12_exception;

class ThrowTest{

	public void print(String str, int cnt) {
	
		if( str == null ) { //���ܻ�Ȳ
			
			throw new NullPointerException(); //���ܹ߻���Ű��
			
		}
		
		for(int j=0;j<cnt;j++) {
			System.out.println( str );
		}
	}
}

public class Exception_07_throw {
	public static void main(String[] args) {
		
		ThrowTest tt = new ThrowTest();
		
		
		try {
			tt.print("HI", 3); //HI�� 3�� ���
			tt.print(null, 3); //HI�� 3�� ���
			
		} catch(NullPointerException e) {
			System.out.println("[WARN] ���ڿ��� null�� �Էµƽ��ϴ�");
		}
	}

}
