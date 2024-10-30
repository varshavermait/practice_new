package designpatterns.state;

public class GumballMachine {
	private State hasQuarterState;
	private State noQuarterState;
	private State soldOutState;
	private State soldState;
	
	State state = soldState;
	int count = 0;
	
	public GumballMachine(int numberGumBalls) {
		hasQuarterState = new HasQuarterState();
		noQuarterState = new SoldOutState();
		soldOutState = new SoldOutState();
		soldState = new SoldState();
		
		this.count = numberGumBalls;
		if(numberGumBalls > 0)
			state = noQuarterState;
		else
			state = soldOutState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}
	public State getSoldState() {
		return soldState;
	}
	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
