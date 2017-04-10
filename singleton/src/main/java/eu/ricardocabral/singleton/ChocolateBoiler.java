package eu.ricardocabral.singleton;

public class ChocolateBoiler {

	//do it to rely in jvm
	//private static ChocolateBoiler instance = new ChocolateBoiler();
	
	//volatile ensures that multiple threads handke the instance
	//variable correctly when it being initialized
	//to Singleton instance
	private volatile static ChocolateBoiler instance = null;
	private boolean empty;
	private boolean boiled;
	
	//you can have problems with singleton if the application uses
	//more than one classloader
	//if performance is an issue this method of implementing singleton
	//can reduce the overhead drastically
	public static  ChocolateBoiler getInstance(){
		//check for an instance and if there isn't one
		//enter a synchronized block
		if(instance == null){
			synchronized (Singleton.class) {//synchronize the first time only
				if(instance == null){
					instance = new ChocolateBoiler();
				}
			}
		}
		return instance;
	}
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			//drain the boiled milk and chocolate
			empty = true;
		}
	}

	public void boil(){
		if(!isEmpty() && !isBoiled()){
			//bring the contents to a boil
			boiled = true;
		}
	}
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
