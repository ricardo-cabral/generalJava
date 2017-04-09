package eu.ricardocabral;

public class ChicagoStyleCheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}

	void cut(){
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	void prepare() {
		System.out.println("Preparing: " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
	}
}
