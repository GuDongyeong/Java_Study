package java07_inherit.product;

public class Computer extends Product {

	public Computer(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {//Product.out()을 구현해야만 하는 의무가 생김
		System.out.println("Computer");
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}

}
