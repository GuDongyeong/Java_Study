package java12_exception;

import java12_exception.CheckEven;

public class Exception_12_CustomException {
	public static void main(String[] args) {
		
		// ¦������ �Ǻ� ��ü
		
		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13); // Ȧ�� -> ���� ��Ȳ -> "Ȧ���� �ȵ˴ϴ�!" ���ܸ޽��� ���
		} catch (OddNumberException e) {
			e.printStackTrace();
		}
		
		try {
			ce.check(12); // ¦�� -> �������� ��Ȳ "¦���� �½��ϴ�!"
		} catch (OddNumberException e){
			e.printStackTrace();
		}
	}
}
