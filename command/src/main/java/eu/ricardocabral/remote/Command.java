package eu.ricardocabral.remote;

public interface Command {

	public void execute();
	public void undo();
}
