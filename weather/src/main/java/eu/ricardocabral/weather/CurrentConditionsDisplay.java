package eu.ricardocabral.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	float temperature;
	float humidity;
	float pressure;
	
	private final Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and "+ humidity+"% humidity");

	}

	public void update(float temp, float humidty, float pressure) {
		this.temperature = temp;
		this.humidity = humidty;
		this.pressure = pressure;
		display();
		
	}

	

}
