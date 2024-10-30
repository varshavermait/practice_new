package designpatterns.strategy;

public class DisplayDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("I am a display duck. I decorate beautifully.");
	}
}