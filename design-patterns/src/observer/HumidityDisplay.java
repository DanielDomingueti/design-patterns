package observer;

public class HumidityDisplay implements Observer {
    @Override
    public void update(String weatherData) {
        System.out.println("Humidity exhibition: " + weatherData);
    }
}