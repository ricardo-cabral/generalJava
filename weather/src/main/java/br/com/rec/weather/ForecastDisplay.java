package br.com.rec.weather;

public class ForecastDisplay implements DisplayElement, Observer {

	private float currentPressure = 29.92f;  

	
	private float lastPressure;
	
	private final Subject weatherData;
	
	public ForecastDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}

	}

	public void update(float temp, float humidty, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
		
	}

}
