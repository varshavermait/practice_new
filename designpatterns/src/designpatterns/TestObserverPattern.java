package designpatterns;


import designpatterns.observer.DisplayImpl;
import designpatterns.observer.DisplayOtherWay;
import designpatterns.observer.Displayable;
import designpatterns.observer.TempratureData;

public class TestObserverPattern {
	public static void main(String args[]) {
		TempratureData subject = new TempratureData(1, 2);
		Displayable display = new DisplayImpl(subject);
		Displayable display2 = new DisplayOtherWay(subject);
		
		
		subject.changeData(2, 4);
		subject.changeData(5, 6);

	}
}
