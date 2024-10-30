package designpatterns.adapter;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("I am mallard duck and can quack");
		
	}

	@Override
	public void fly() {
		System.out.println("I can fly");
		
	}

}
