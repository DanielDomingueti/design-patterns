package observer;

public class ObserverExecution {

    //use case: when objects need to be notified when other objects are changed
    //behavioral design pattern

    public static void main(String[] args) {
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(humidityDisplay);

        weatherStation.setWeatherData("30°C, 60% humidity.");
    }
}