package designpatterns.decorator;

public class Expresso extends Baverage{
	
	public Expresso() {
		description = "This is Expresso";
	}
	
	public double getCost() {
		return super.getCost() + 1;
	}
}
