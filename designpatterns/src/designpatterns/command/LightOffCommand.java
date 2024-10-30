package designpatterns.command;

public class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

}
