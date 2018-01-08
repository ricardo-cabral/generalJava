package eu.ricardocabral.remote;

public class GarageDoorOpenCommand implements Command{
	GarageDoor garage;
	
	public GarageDoorOpenCommand(GarageDoor garage) {
		this.garage = garage;
	}
	
	public void execute(){
		garage.up();
	}

	@Override
	public void undo() {
		garage.down();
		
	}

}
