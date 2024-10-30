package designpatterns.command;

public class Remote {
	private Command command;
	
	public Remote() {
		// TODO Auto-generated constructor stub
	}
	
	public Remote(Command command) {
		this.command = command;
	}
	
	public void onButtonPress() {
		command.execute();
	}
}
