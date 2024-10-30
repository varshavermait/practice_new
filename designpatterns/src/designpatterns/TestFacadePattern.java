package designpatterns;

import designpatterns.facade.HomeTheaterFacade;

public class TestFacadePattern {
	//Least knowledge principle // talk only with immediate one
	
	// provides a unified interface to a set of interfaces
	// defines higher lavel of interface to make things easy
	
	
	public static void main(String args[])
	{
		// if you think it as client it does need to bother so many things
		// those things are facade for client
		HomeTheaterFacade facade = new HomeTheaterFacade( // pass params
				);
		facade.watchMovie("abc");
		facade.endMovie("abc");;
	}
}
