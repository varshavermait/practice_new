package designpatterns.strategy;

public abstract class Duck {
	protected Quackable quackable;
	protected Flyable flyable;
	
	public Duck() {}
	public Duck(Flyable flyable) {
		this.flyable = flyable;
	}
	public Duck(Quackable quackable) {
		this.quackable = quackable;
	}
	public Duck(Quackable quackable, Flyable flyable) {
		this.quackable = quackable;
		this.flyable = flyable;
	}
	
	public void display() {} // all ducks have their own display.
	
	public void swim() {
		System.out.println("I swim, infact all ducks swim.");
	}

	public void quack() {
		if(getQuackable() == null) System.out.println("Not sure on quacking behav");
		else getQuackable().quack();
	}
	public void fly() {
		if(getFlyable() == null) System.out.println("Not sure on flying behav");
		else getFlyable().fly();
	}

	public Quackable getQuackable() {
		return quackable;
	}

	public void setQuackable(Quackable quackable) {
		this.quackable = quackable;
	}

	public Flyable getFlyable() {
		return flyable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}
}
