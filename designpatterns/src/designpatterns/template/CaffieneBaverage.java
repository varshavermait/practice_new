package designpatterns.template;

public abstract class CaffieneBaverage {
	public void prepare() {
		boldWater();
		brew();
		pourInCup();
		if(customerWantsCondeminent())
			addCondeminent();
	}
	
	public void boldWater() {
		System.out.println("Boiling water");
	}
	
	public abstract void brew();
	
	public void pourInCup() {
		System.out.println("pour in cup");
	}
	
	public abstract void addCondeminent();
	
	public abstract boolean customerWantsCondeminent();
}
