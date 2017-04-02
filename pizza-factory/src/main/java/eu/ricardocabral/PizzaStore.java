package eu.ricardocabral;

/**
 * 
 * @author Ricardo
 *
 */
public abstract class PizzaStore {

	
	
	protected Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
