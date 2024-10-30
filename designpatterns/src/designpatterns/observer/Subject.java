package designpatterns.observer;

public interface Subject {
	public void subscribe(Observable ob);
	public void unsubscribe(Observable ob);
	public void notifyObs();
}
