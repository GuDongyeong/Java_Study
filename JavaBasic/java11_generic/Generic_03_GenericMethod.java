package java11_generic;

// �Ϲ� Ŭ����
class Class03{
	
	// �Ϲ� �޼ҵ�
	public void display(int n) {
		
	}
	
	// ���׸� �޼ҵ�
	public <T> T print(T t) { // T�� Object ������ �ִ� // ��ȯŸ��, �Ű�����, ������������ ��밡��
		
//		T data = 123; // int�� �������̹Ƿ� Object�� ��ȯ?���� ����
		T data = (T) null; // ����ȯ���� ����� �� �ִ�.
		return data;
	}
	
}

//���׸� Ŭ����
class Class03_2<T> {
	
	//���׸� �޼ҵ�
	public <K> void display(K obj, T data) { // ���������� �� ��쵵 �����ϴ�
		
	}
}

public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		Class03 c03 = new Class03();
		
		//--------------------------------
		
		c03.print(123); // Ÿ���Ķ���� �������� ����. T-> Integer �Ű����� Ÿ������ �ڵ����� �����ȴ�.
		
//		c03.<Double>print(555); // ����
		c03.<Double>print(12.34); // T -> Double // Ÿ���Ķ���͸� ����Ϸ��� �޼ҵ� ���ڿ� ���� Ÿ���̾�� �Ѵ�.
		
				
		
		
	}

}
