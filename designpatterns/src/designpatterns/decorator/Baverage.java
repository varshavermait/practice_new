package designpatterns.decorator;

public class Baverage {
	protected String description;
	
	private double milkCost;
	private double soyCost;
	private double mochaCost;
	private double whipCost;
	
	private boolean hasMilk;
	private boolean hasSoy;
	private boolean hasMocha;
	private boolean hasWhip;
	
	public Baverage() {}
	public Baverage(int mCost, int sCost, int mochaCost, int wCost) {
		this.milkCost = mCost;
		this.soyCost = sCost;
		this.mochaCost = mochaCost;
		this.whipCost = wCost;
	}
	
	public double getCost() {
		double condimentCost = 0.0;
		if(isHasMilk())
			condimentCost+= getMilkCost();
		if(isHasSoy())
			condimentCost+= getSoyCost();
		if(isHasMocha())
			condimentCost+= getMochaCost();
		if(isHasWhip())
			condimentCost+= getWhipCost();
		return condimentCost;
	}
	
	public double getMilkCost() {
		return milkCost;
	}
	public void setMilkCost(double milkCost) {
		this.milkCost = milkCost;
	}
	public double getSoyCost() {
		return soyCost;
	}
	public void setSoyCost(double soyCost) {
		this.soyCost = soyCost;
	}
	public double getMochaCost() {
		return mochaCost;
	}
	public void setMochaCost(double mochaCost) {
		this.mochaCost = mochaCost;
	}
	public double getWhipCost() {
		return whipCost;
	}
	public void setWhipCost(double whipCost) {
		this.whipCost = whipCost;
	}
	public boolean isHasMilk() {
		return hasMilk;
	}
	public void setHasMilk(boolean hasMilk) {
		this.hasMilk = hasMilk;
	}
	public boolean isHasSoy() {
		return hasSoy;
	}
	public void setHasSoy(boolean hasSoy) {
		this.hasSoy = hasSoy;
	}
	public boolean isHasMocha() {
		return hasMocha;
	}
	public void setHasMocha(boolean hasMocha) {
		this.hasMocha = hasMocha;
	}
	public boolean isHasWhip() {
		return hasWhip;
	}
	public void setHasWhip(boolean hasWhip) {
		this.hasWhip = hasWhip;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
