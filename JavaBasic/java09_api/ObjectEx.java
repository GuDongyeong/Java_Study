package java09_api;

class Point implements Cloneable {//clone 제한을 풀어주는 장치
	int x; //x좌표
	int y; //y좌표
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	//toString() 생성 단축기 : alt + shift + s, s
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		return "( " + x + ", " + y + " )";
//	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		//p2.equals(p3)
		
		//p2 -> this
		//p3 -> obj
		
		
		if(this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
			return true;			
		}
		
		return false;

	}
	

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}

public class ObjectEx {
	public static void main(String[] args) {
		
		Object obj = new Object();
		Point p1 = new Point(10, 20);
		
		System.out.println("---toString-----------------");
		
		System.out.println(obj.toString());
		System.out.println(p1.toString());
		
		System.out.println("---------------------");
		
		//System.out.println의 전달인자로 객체가 사용되면 toString()의 반환값을 출력한다
		System.out.println( obj );
		System.out.println( p1 );
		
		
		System.out.println("---equals--------------------");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;//얕은 복사
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		
		// 동일성을 비교하는 코드 - identity
		//	같은 객체인지 확인, 같은 참조대상을 가리키고 있는지 확인
		//	== 연산자
		System.out.println( "p2==p3 : " + (p2==p3) );
		System.out.println( "p2==p4 : " + (p2==p4) );
		
		System.out.println("----------------------");
		
		// 동등성을 비교하는 코드 - equality
		//	같은 값인지 확인, 참조대상의 값이 같은 값인지 확인
		//	equals() 메소드
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		System.out.println("p2.equals(p4) : " + p2.equals(p4));
		
		System.out.println("----hashCode-----------------");
		
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println("----------------------------");
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		// 문자열 String은 hashCode() 메소드를 오버라이딩 하고 있다
		// 문자열의 내용물 ( 각 char데이터 )를 가지고
		// 재생산된 고유값을 반환한다
		
		System.out.println("----clone---------------------");
		
		Point p_ori = new Point(33, 44);
		
		Point p_clone1 = p_ori; //얕은 복사
		
		Point p_clone2 = new Point( p_ori.x, p_ori.y );
		
		// clone() 을 이용한 객체 복사(깊은 복사)
		
		Point p_clone3 = null;
		
		try {
			p_clone3 = (Point)p_ori.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( p_clone3 );
		
		System.out.println("p_ori.equals(p_clone3) : " + p_ori.equals(p_clone3));
		
		System.out.println("p_ori==p_clone3 : "+ (p_ori==p_clone3) );
		
		
		System.out.println( Math.abs(-5) );
		
		
	}

}
