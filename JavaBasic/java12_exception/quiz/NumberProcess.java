package java12_exception.quiz;

import java12_exception.quiz.exception.NumberRangeException;

public class NumberProcess {
	
//	Ŭ���� : java12_exception.quiz.NumberProcess
//	[����Ʈ ������]
//
//	[�޼ҵ�]
//	public boolean checkDouble(int n1, int n2){}
//	// ������ ���� �ΰ��� ���޹޾�, ù��° ���� �ι�°���� ������� Ȯ���ϰ�
//	����� ������ true �� �����ϰ�, �ƴϸ� false�� ������
//	//��, ���޵� ù��°�� �ι�° ���� 1~100������ ���� �ƴϸ�
//	NumberRangeException �߻���Ŵ
//	�����޽��� : "1���� 100������ ���� �ƴմϴ�."

	public boolean checkDouble(int n1, int n2) {
		
		if( n1 < 1 && n1 > 100 && n2 < 1 && n2 > 100 ) {
			throw new NumberRangeException();
		}else {
			
			if( n1%n2 == 0) {
				return true;
			}else {
				return false;
			}
			
		}
		
		
		
	}
	
	
	
	
}
