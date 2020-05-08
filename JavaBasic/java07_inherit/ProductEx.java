package java07_inherit;

import java07_inherit.person.Person;
import java07_inherit.product.Computer;
import java07_inherit.product.Product;
import java07_inherit.product.Tv;

public class ProductEx {
	public static void main(String[] args) {
		
		System.out.println("---상속 전 테스트-----------------");
		Computer c1 = new Computer("i7", 1000);
		c1.out();
		
		Tv t1 = new Tv("Canvas", 800);
		t1.out();
		
		
		
		System.out.println("---상속 후 테스트-----------------");
		Product p1 = new Computer("i5", 700);
		p1.out();
		
		Product p2 = new Tv("LG", 500);
		p2.out();
		
		//하나의 데이터타입으로 다른 인스턴스를 사용할 수 있도록 한다 - 다형성 폴리모피즘
		
		
		System.out.println("---Product 배열 테스트------------");
		Product[] products = new Product[5];
		int count = 0;
		
		products[count++] = new Computer("com1", 100);
		products[count++] = new Tv("tv1", 200);
		products[count++] = new Tv("tv2", 300);
		
		for(int i=0; i<count; i++)
			products[i].out();
		
		System.out.println(count+"개 물건 구입");
		
		
		
		System.out.println("---Person------------");
		Person p = new Person("Alice", 10000);
		System.out.println(p.getName() + "의 예산 : " + p.getMoney());
		System.out.println("-------------------------------");
		
		Product prod1 = new Tv("LG", 500);
		Product prod2 = new Computer("i5", 500);
		Product[] prodArr = new Product[5];
		prodArr[0] = new Tv("Samsung", 2000);
		prodArr[1] = new Computer("Gram", 5000);
		prodArr[2] = new Computer("Mac", 4000);
		prodArr[3] = new Tv("Tt", 6000);
		prodArr[4] = new Tv("i0", 10000);
		
		p.buy(prod1);
		p.buy(prod2);
		p.buy( new Computer("i5", 500) );
		p.sell(prod1);
		p.buy(prodArr[0]);
		p.sell(prodArr[2]);
		p.buy(prodArr[3]);
		p.buy(prodArr[2]);
		
		
		
		System.out.println("===product 추상 클래스=====");

		//추상클래스는 객체 생성불가(인스턴스화 불가)
//		Product pp = new Product("data", 123);
		
		Product pp1;//객체변수
		
		pp1 = new Tv("d1", 123);
		
		
	}
}









