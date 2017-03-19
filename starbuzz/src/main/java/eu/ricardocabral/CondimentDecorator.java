package eu.ricardocabral;


public abstract class CondimentDecorator extends Beverage {

	private Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize(){
		return beverage.getSize();
	}

}