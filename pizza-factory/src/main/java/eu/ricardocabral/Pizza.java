package eu.ricardocabral;

public abstract class Pizza {

	public void prepare() {
		System.out.println("Preparing generic pizza");
	}

	public void bake() {
		System.out.println("Baking generic pizza");
	}

	public void cut() {
		System.out.println("Cutting generic pizza");
	}

	public void box() {
		System.out.println("Boxing generic pizza");
	}

}
