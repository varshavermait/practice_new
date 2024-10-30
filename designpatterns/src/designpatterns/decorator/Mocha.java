package designpatterns.decorator;

public class Mocha extends CondimentDecorator{
	Baverage baverage;
	
	public Mocha(Baverage baverahe) {
		this.baverage = baverahe;
	}
	
	public String getDescription() {
		return baverage.getDescription() +", Mocha" ;	
	}
	
	public double getCost() {
		return baverage.getCost() + .20;	
	}
}
