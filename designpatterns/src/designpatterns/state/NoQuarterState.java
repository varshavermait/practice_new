package designpatterns.state;

public class NoQuarterState implements State{
	private GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		machine.setState(machine.getSoldOutState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You ejected a quarter");
		
	}

	@Override
	public void tumCrank() {
		System.out.println("You turnCrank");
		
	}

	@Override
	public void dispense() {
		System.out.println("You dispensed");
		
	}

}
