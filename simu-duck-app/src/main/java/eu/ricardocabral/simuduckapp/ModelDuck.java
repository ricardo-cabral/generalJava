package eu.ricardocabral.simuduckapp;

public class ModelDuck extends Duck {
	public ModelDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

}
