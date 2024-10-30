package designpatterns;

import designpatterns.adapter.Duck;
import designpatterns.adapter.MallardDuck;
import designpatterns.adapter.TurkeyAdapter;
import designpatterns.adapter.WildTurkey;

public class TestAdapterPattern {

	// Convert an interface of a class to another interface which client needs
	// It allows classes with imcompatible interaces work together
	public static void main(String args[])
	{
		Duck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		
		duck = new TurkeyAdapter(new WildTurkey());
		duck.quack();
		duck.fly();
		
		
		
		
		// similar example
		// interface Iterator - hasNext(), next(), remove();
		// interface enumerator - hasMoreElements(), nextElement();
		// EnumeratorIteratorAdapter implements Iterator - will give behaviour of enumerator to iterator
		// remove method will throw exception
	}
}
