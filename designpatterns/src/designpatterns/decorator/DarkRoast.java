package designpatterns.decorator;

public class DarkRoast extends Baverage{
	public DarkRoast() {
		description = "This is DarkRoast";
	}
	
	public double getCost() {
		return super.getCost() + 2;
	}
}
