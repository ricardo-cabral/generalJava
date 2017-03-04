package br.com.rec.weather;

public interface Observer {
	
	void update(float temp, float humidy, float pressure);

}
