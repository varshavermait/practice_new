package designpatterns.observer;

public class DisplayImpl implements Displayable, Observable{

	Subject subject;
	private int temp;
	private int humid;
	
	public DisplayImpl() {}
	public DisplayImpl(Subject data) {
		this.subject = data;
		data.subscribe(this);
	}
	
	public void unsub() {
		this.subject.unsubscribe(this);
	}
	
	@Override
	public void update(int temp, int humid) {
		this.temp = temp;
		this.humid = humid;
		display();
	}

	@Override
	public void display() {
		System.out.println("Temprature "+this.temp);
		System.out.println("Humidity "+this.humid);
	}

}
