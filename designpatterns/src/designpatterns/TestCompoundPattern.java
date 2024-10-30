package designpatterns;

import designpatterns.compound.Goose;
import designpatterns.compound.GooseAdapter;
import designpatterns.compound.Quackable;

public class TestCompoundPattern {
	public static void main(String args[]) {
		Quackable gooseDuck = new  GooseAdapter(new Goose());
		gooseDuck.quack();
	}
}
