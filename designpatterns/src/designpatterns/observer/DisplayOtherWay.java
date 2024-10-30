package designpatterns.observer;

public class DisplayOtherWay implements Displayable, Observable{
	private Subject subject;
	private int temp;
	private int humid;

	
	public DisplayOtherWay(Subject sub) {
		this.subject = sub;
		subject.subscribe(this);
	}
	
	@Override
	public void update(int temp, int humid) {
		this.temp = temp;
		this.humid = humid;
		display();
	}

	@Override
	public void display() {
		System.out.println("&&&&&&&  tmp &&&&&& "+temp);
		System.out.println("&&&&&&&  humid &&&&&& "+humid);
	}

}
