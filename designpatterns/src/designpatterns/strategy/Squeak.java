package designpatterns.strategy;

public class Squeak implements Quackable {
	@Override
	public void quack() {
		System.out.println("I Squeak.");
	}
}