package designpatterns.strategy;

public class FlyImpl implements Flyable {
	@Override
	public void fly() {
		System.out.println("I can fly.");
	}
}