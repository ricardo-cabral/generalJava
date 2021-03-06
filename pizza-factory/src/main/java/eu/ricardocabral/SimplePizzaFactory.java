package eu.ricardocabral;

/**
 * The factory method Pattern defines an interfacing
 * for creating an object, but lets the subclasses decide
 * which class to instantiate. Factory method lets a 
 * class defer instantiation to subclasses
 * 
 * @author Ricardo
 *
 */
/*
 * Older version, just kep it here to understand the pattern
 */
public class SimplePizzaFactory {

	//often static
	public static Pizza createPizza(String type) {
		Pizza pizza = null;

	/*	if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
*/
		return pizza;
	}

}
