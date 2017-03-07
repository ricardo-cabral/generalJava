package eu.ricardocabral;

/**
 * Open-closed Principle: 
 * Classes should be open for extension, but closed for modification
 * 
 * @author Ricardo
 *
 */
public abstract class Beverage {

	protected String description;
	
	public String getDescription(){
		return this.getDescription();
	}
	
	public abstract float cost();
}
