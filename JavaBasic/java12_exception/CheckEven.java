package java12_exception;

public class CheckEven {
 
	//�������ڰ� ¦������ Ȧ������ �Ǻ��ϴ� ��� 
	public void check(int num) throws OddNumberException {

		if( num%2 == 0 ) { //¦�� - ���� ��Ȳ
			System.out.println("¦���� �½��ϴ�");
			
		} else { //Ȧ�� - ���� ��Ȳ
			throw new OddNumberException();
			
		}
		
	}
	
}







