package eu.ricardocabral;

import java.util.Observable;
import java.util.Observer;

import eu.ricardocabral.weather.interfaces.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and "+ humidity+"% humidity");
		
	}

	@Override
	public void update(Observable obs, Object args) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
	
		}
				
	}

}
