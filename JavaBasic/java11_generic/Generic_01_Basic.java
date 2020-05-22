package java11_generic;

import java.util.ArrayList;
import java.util.List;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		//ArrayList is a raw type ��õ Ÿ��
		// Ÿ�� �Ķ���� E�� �������� ������ Object�� ����
		
		list.add(123);
		list.add("Apple");
		
		System.out.println("--------------------------------");
		
		List<String> list2 = new ArrayList<>();
		// �θ�Ŭ����(����)�� �ν��Ͻ��� ������Ÿ���� �ݵ�� ���ƾ��Ѵ�. �ν��Ͻ��� �Ķ���ʹ� �����ʾƵ� ����
		// Ÿ�� �Ķ���� E -> String ����
		
		list2.add("A");
//		list2.add(123); // ����
		
		//------------------------------------------------------
		
		// �Ķ���ͷ� �⺻ ������Ÿ�� ��� �Ұ� - WrapperŬ���� ���
//		List<int> list3 = new ArrayList<>(); 
		List<Integer> list3 = new ArrayList<>();
		
		list3.add(123); //int ��� - ���� �ڽ�
		
		
		//---------------------------------------------------------
		
		//Ÿ�� ������
		// �����ڰ� �ǵ��� ������Ÿ�����θ� ���Ǵ� ��
		
//		list2.add(true); //����, String���θ� ��� �����ϴ�
//		list3.add("�ȳ�"); //����, Integer�� ��밡��
		
		//---------------------------------------------------------
		
		String str1 = (String) list.get(1); // Ÿ�� �������� ����, ����ȯ �ʿ�
		
		String str2 = list2.get(1); // ����ȯ�� �ʿ����.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
