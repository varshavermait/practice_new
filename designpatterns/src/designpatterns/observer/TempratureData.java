package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TempratureData implements Subject{

	private List<Observable> observers;
	private int temp;
	private int humid;
	
	public TempratureData(int temp, int humid) {
		this.temp = temp;
		this.humid = humid;
	}
	
	@Override
	public void subscribe(Observable ob) {
		if(observers == null) observers = new ArrayList<>();
		observers.add(ob);
	}

	@Override
	public void unsubscribe(Observable ob) {
		observers.remove(ob);
	}
	
	@Override
	public void notifyObs() {
		for(Observable obs : observers)
			obs.update(this.temp, this.humid);
	}

	public void changeData(int temp, int humid)
	{
		this.temp = temp;
		this.humid = humid;
		notifyObs();
	}

	public List<Observable> getObservers() {
		return observers;
	}

	public void setObservers(List<Observable> observers) {
		this.observers = observers;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumid() {
		return humid;
	}

	public void setHumid(int humid) {
		this.humid = humid;
	}
	
}
