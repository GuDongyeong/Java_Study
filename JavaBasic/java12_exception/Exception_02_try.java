package java12_exception;

public class Exception_02_try {
	public static void main(String[] args) {
		
		int[] arr = new int[5]; // �ε��� : 0~4
		
		int i = 0;
		
		try {
			while(true) { // ���ѷ���
				
				
				arr[i] = i + 1; //�迭�� �� ����
				System.out.println( arr[i]); //�迭�� ��� ���
				
				System.out.println("---" + i + "��° �Ϸ� ---");
				
				i++;
			}
		} catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("[SYSTEM] �ε����� " + arr.length + "���� �۾ƾ��մϴ�");
			
			e.printStackTrace(); //������ ������ ����Ѵ�, ������ �ڵ带 ������ �� �������� ���
		}
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
		
		
		
		
		
		
	}
}
