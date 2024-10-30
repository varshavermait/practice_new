package designpatterns;

import designpatterns.strategy.DisplayDuck;
import designpatterns.strategy.Duck;
import designpatterns.strategy.FlyImpl;
import designpatterns.strategy.MallardDuck;
import designpatterns.strategy.Mute;
import designpatterns.strategy.NoFly;
import designpatterns.strategy.Squeak;

public class TestStrategyPattern {
	public static void main(String args[]) {
		Duck duck = new DisplayDuck();
		duck.setQuackable(new Mute());
		duck.setFlyable(new NoFly());
		testDuckBehaviour(duck);
		
		Duck mduck = new MallardDuck();
		duck.setQuackable(new Squeak());
		duck.setFlyable(new FlyImpl());
		testDuckBehaviour(mduck);
		
	}
	
	public static void testDuckBehaviour(Duck duck) {
		System.out.println("** Testing ducks behaviour **");
		duck.display();
		duck.swim();
		duck.quack();
		duck.fly();
	}
}
