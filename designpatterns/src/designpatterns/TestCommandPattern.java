package designpatterns;

import designpatterns.command.Command;
import designpatterns.command.Light;
import designpatterns.command.LightOffCommand;
import designpatterns.command.LightOnCommand;
import designpatterns.command.Remote;

public class TestCommandPattern {
	// Encapsulate a request as an object,
	// so that we can parameterize client with diff request, queue, log req and support variable operations
	
	public static void main(String args[]) {
		Light light = new Light();
		Command offCommand = new LightOffCommand(light);
		Command onCommand = new LightOnCommand(light);
		Remote remote = new Remote(offCommand);
		Remote remote2 = new Remote(onCommand);
		remote.onButtonPress();
		remote2.onButtonPress();
		
		
//		Command comm1 = () -> System.out.print("Light is off");
//		Command comm2 = () -> System.out.print("Light is on");
		 
	}
}
