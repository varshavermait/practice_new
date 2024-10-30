package designpatterns.command;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
