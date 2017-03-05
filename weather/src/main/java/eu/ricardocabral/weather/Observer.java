package eu.ricardocabral.weather;

public interface Observer {
	
	void update(float temp, float humidy, float pressure);

}
