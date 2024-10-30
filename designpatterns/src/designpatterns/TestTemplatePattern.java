package designpatterns;

import designpatterns.template.CaffieneBaverage;
import designpatterns.template.Coffee;
import designpatterns.template.Tea;

public class TestTemplatePattern {
	
	// template pattern is also used in Arrays.sort
	// By using comparator
	
	
	public static void main(String args[])
	{
		System.out.println("*** making tea ****");
		CaffieneBaverage baverage = new Tea();
		baverage.prepare();
		System.out.println("your tea is ready");
		System.out.println();
		System.out.println("*** now making coffee ****");
		baverage = new Coffee();
		baverage.prepare();
		System.out.println("your coffee is ready");
	}
}
