package java12_exception.quiz;

import java.util.Scanner;

import java12_exception.quiz.exception.CharCheckException;

public class ExceptionQuizEx {
	
	final static Scanner sc = new Scanner(System.in);

	public static void quiz1() {
		
		
		CharacterProcess cp = new CharacterProcess();
		
		try {
			System.out.print("�����ڸ� �Է��Ͻÿ� : ");
			
			int cnt = cp.countAlpha(sc.nextLine());
			
			System.out.println( "���ڿ� ���� : " + cnt );
			
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void quiz2(){
		
		NumberProcess np = new NumberProcess();
		
		System.out.print("���� 2���� �Է��Ͻÿ� : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		boolean multiple = np.checkDouble(n1, n2);
		
		if( multiple ) {
			System.out.println( n1 + "�� " + n2 + "�� ����̴�");
		}else {
			System.out.println( n1 + "�� " + n2 + "�� ����� �ƴϴ�");
		}
		
		
	}
	//2 ���� ������ �Է¹޾�, checkDouble �޼ҵ�� �����ϸ鼭 ������
//	���ϵ� ����� "ooo�� ooo�� ����̴�/����� �ƴϴ�." �����
	
	
	public static void main(String[] args) {
//		quiz1();
		quiz2();
		
		
	}
}
