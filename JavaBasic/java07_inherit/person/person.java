package java07_inherit.person;

import java07_inherit.product.Product;

public class Person {
	private String name;
	private int money;
//	private Product prod;
	private Product[] prodA = new Product[7];
	int count = 0;

	
	public Person(String name, int money) {
		setName(name);
		setMoney(money);
	}
	
	public void buy(Product prod) {
		if(count == prodA.length) {
			System.out.println("물건을 더 이상 살 수 없습니다.");
		}else {
			this.count++;
			for(int i=0;i<count;i++) {
				if(prodA[i] == null) {
					if(this.money >= prod.getPrice()) {
						this.prodA[i] = prod;
						setMoney(this.money-prod.getPrice());
						System.out.println(name + "님이 " + prod.getPrice() + "원을 지불하고 " + prod.getModel() + "구매함");
						System.out.println("[잔액] " + getMoney());
						System.out.println("------------------------------");
						break;
					}else {
					System.out.println("돈이 부족합니다");
					System.out.println("------------------------------");
					}
				}
			}
		}
	}
	
	public void sell(Product prod) {
		for(int i = 0;i<this.count;i++) {
			if(prodA[i].getModel() == prod.getModel()) {
				setMoney(money+prod.getPrice());
				System.out.println(name + "님이 " + prod.getPrice() + "원을 받고 " + prod.getModel() + "판매함");
				System.out.println("[잔액] " + getMoney() + "원");
				System.out.println("-------------------------------");
				prodA[i] = null;
				count--;
				break;
			}
		
		}
		
//		this.prod = prod;
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	

}
