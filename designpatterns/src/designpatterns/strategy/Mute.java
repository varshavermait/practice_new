package designpatterns.strategy;

public class Mute implements Quackable {
	@Override
	public void quack() {
		System.out.println("I am mute.");
	}
}