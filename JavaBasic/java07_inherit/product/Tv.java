package java07_inherit.product;

public class Tv extends Product{
	
	public Tv(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("Tv");
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}
		


}
