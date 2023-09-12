package observer;

public class TemperatureDisplay implements Observer {
    @Override
    public void update(String weatherData) {
        System.out.println("Temperature exhibition: " + weatherData);
    }
}
