package eu.ricardocabral.simuduckapp;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swin() {
		System.out.println("swin");
	}

	public void display() {
		System.out.println("display");
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
