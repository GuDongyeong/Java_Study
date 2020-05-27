package java12_exception;

class User{
	
	private int age; // ����

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException{
		
		if( age < 0 || age >150 ) { //���� ��Ȳ, UserAgeException
			throw new UserAgeException(); // ���� �߻���Ű��
		}
		
		this.age = age;
	}
}

// ����� ���� ���� Ŭ����
//class UserAgeException extends Exception { //Checked
class UserAgeException extends RuntimeException { //Unchecked
	
	@Override
	public String getMessage() {
		return "���̴� 0���� �۰ų� 150���� Ŭ �� ����"; //���� �޽���
	}
}

public class Exception_11_CustomException {
	public static void main(String[] args) {
		
//		throw new UserAgeException();
		
		
		User user = new User();
		
		try {
			user.setAge(-5);
		} catch (UserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user.setAge(-5); // Unchecked�� �������ϰ� ���� ������ �� �� �ִ�.
		
				
				
	}

}
