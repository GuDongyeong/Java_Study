package java12_exception;

public class Exception_01_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[5]; // �ε��� : 0~4
		
		int i = 0;
		
		while(true) { // ���ѷ���
			
			if( i<0 || i >= arr.length ) { // ����ó�� Exception Handling
				System.out.println("[SYSTEM] �ε����� " + arr.length + "���� �۾ƾ��մϴ�");
				break;
			}
			
			
			arr[i] = i + 1; //�迭�� �� ����
			System.out.println( arr[i]); //�迭�� ��� ���
			
			System.out.println("---" + i + "��° �Ϸ� ---");
			
			i++;
		}
		
		System.out.println("+ + + ���α׷� ���� ���� + + +");
	}
}
