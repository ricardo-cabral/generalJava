package eu.ricardocabral;


/**
 * Open-closed Principle: 
 * Classes should be open for extension, but closed for modification
 * 
 * The Decorator Pattern attaches additional responsibilities
 * to an object dynamically.
 * 
 *   Decorators provide a flexible alternative to subclassing
 *   for extending functionality
 *   
 * @author Ricardo
 *
 */
public abstract class Beverage {

	String description = "Unknown Beverage";
	Size size = Size.TALL;

	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	
}
