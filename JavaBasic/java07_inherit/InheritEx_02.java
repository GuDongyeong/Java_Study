package java07_inherit;

class Parent2 {
//	private int num;부모 클래스의 멤버필드가 private일 경우 에러남
	protected int num;//같은 패키지 내 + 상속관계
	
	public void display() {
		System.out.println("부모 메소드");
	}
}

class Child2 extends Parent2 {
	
//	private int num;//같은 이름의 변수를 상속받아 재정의하는 경우 거의 하지 않는다., 부모클래스가 public일 경우 자식클래스가 숨기고 싶을 때 private으로 바꾸는 경우만
	
	@Override
	public void display() {
		num = 100;
		
		System.out.println("오버라이딩 메소드");
	}

}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		
		c.num = 123;
		
		c.display();
		
		System.out.println("---------------------------");
		
		Parent2 p = new Parent2();
		
		p.num = 333;
		p.display();
		
		System.out.println("---------------------------");

		Parent2 pc = new Child2(); // Parent2 타입의 변수 <- Child2 인스턴스 저장 - 형변환, 자식클래스가 어떤 수정, 변화가 일어나든 부모클래스가 받아준다.
									// 자식클래스가 멤버가 더 많든 상관없이 부모클래스(데이터타입)로 저장(형변환)할 수 있다.
									// 변수는 어차피 4B기 때문에 기본형 형변환과는 다름
		
//		Child2 cp = (Child2) new Parent2(); // Child2 <- Parent2 
//		ClassCastException 발생 무조건 안되는 상황 부모 클래스를 자식 클래스로 형변환
		
		pc.display(); //Child2의 메소드 호출 - 동적 바인딩
		
		pc.num = 222; // Parent2 의 변수 사용 - 정적 바인딩
//		((Child2)pc).num = 111;//이 경우에는 차일드2와 바인딩
		
		
	}

}
