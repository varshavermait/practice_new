package designpatterns.adapter;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("I can gobble");
		
	}

	@Override
	public void fly() {
		System.out.println("I can fly in very short dist");
		
	}

}
