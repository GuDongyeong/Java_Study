package java08_abstract.interfaceEx;

abstract class TestClass {//추상클래스
	
	public abstract void method();//추상메소드
	

}

interface TestInterface {
	
	public static final int num = 100;//인터페이스의 멤버필드는 선언과 동시에 초기화해야 한다. 추천
	
	//public static final 을 명시하지 않아도 전부 적용되어 있음- 정적상수가 됨
	int MAX = 2000;
	static int S = 400;
	final int F = 500;
	
//	abstract 키워드가 없어도 추상메소드로 만들어짐
	public void display();
	
	public abstract void out();//추천
}



class Test extends TestClass implements TestInterface {//추상클래스 상속 //인터페이스 구현(=상속)

	int t = MAX;//상속받았기 때문에 바로 사용 가능
	
	
	@Override
	public void method() {//추상메소드 구현해야하는 의무

	}

	@Override
	public void display() {
	
	}
	
	@Override
	public void out() {
		
	}
	
}


public class interfaceEx_01 {
	public static void main(String[] args) {
		
	}
}
