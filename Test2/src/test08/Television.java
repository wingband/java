package test08;

public class Television extends Product {

	public Television(String categroy, int price) {
		super(categroy, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void info() {
		System.out.println("제품분류 : "+categroy);
		System.out.println("제품가격 : "+price);
	}

}
