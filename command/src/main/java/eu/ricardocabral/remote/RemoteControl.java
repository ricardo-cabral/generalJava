package eu.ricardocabral.remote;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		if(onCommands[slot] != null)
		onCommands[slot].execute();
	}
	
	public void offButtonWasPusshed(int slot){
		offCommands[slot].execute();
	}
	
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n------Remote Control---------\n");
		for (int i = 0; i < offCommands.length; i++) {
			buffer.append("[slot" + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
		}
		
		return buffer.toString();
	}
	

}
