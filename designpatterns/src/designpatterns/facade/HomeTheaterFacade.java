package designpatterns.facade;

public class HomeTheaterFacade {
	// Amplifier amp;
	// Tuner tuner;
	// DVDPlayer dvdPlayer;
	// ........
	//.......
	
	
	public HomeTheaterFacade(// all above props
			) {
		// set here
	}
	
	public void watchMovie(String movie)
	{
		System.out.println("Watching a movie");
		//amp.on
		//dvd.on
		//.....
	}
	
	public void endMovie(String movie)
	{
		System.out.println("Shuting down");
		//amp.off
		//dvd.off
		//.....
	}
}
