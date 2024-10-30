package designpatterns;

import designpatterns.decorator.Baverage;
import designpatterns.decorator.DarkRoast;
import designpatterns.decorator.Expresso;
import designpatterns.decorator.Mocha;

public class TestDecoratorPattern {
	public static void main(String args[])
	{
		Baverage baverage = new Expresso();
		baverage.setMilkCost(1);
		System.out.println(baverage.getDescription());
		System.out.println(baverage.getCost());
		baverage.setHasMilk(true);
		System.out.println(baverage.getCost());
		
		
		Baverage b2 = new DarkRoast();
		b2.setMilkCost(2);
		
		System.out.println(b2.getDescription());
		System.out.println(b2.getCost());
		b2.setHasMilk(true);
		System.out.println(b2.getCost());
		b2 = new Mocha(b2);
		System.out.println(b2.getCost());
		b2 = new Mocha(b2);
		System.out.println(b2.getCost());
		
	}
}
