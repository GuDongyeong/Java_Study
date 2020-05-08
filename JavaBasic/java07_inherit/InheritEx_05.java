package java07_inherit;

class Parent5 {
	public void display() {
		System.out.println("부모메소드");
	}
}

//final class Child5 extends Parent5{//상속을 줄 수 없는 클래스
class Child5 extends Parent5{
	@Override
	public final void display() {//final 더이상 변경, 확장할 수 없게 만든다. 변수 - 값 고정, 메소드 - 오버라이딩 불가
		System.out.println("자식 클래스 오버라이딩");
	}
}

class GrandChild extends Child5{
//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
}


public class InheritEx_05 {
	public static void main(String[] args) {
		
		GrandChild gc = new GrandChild();
		gc.display();
		
	}
}
