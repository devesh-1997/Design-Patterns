package observer;

public class WeatherDesktopApp implements Observer{

    private double temperature;
    private double humidity;
    private double pressure;
    private Subject weatherData;

    public WeatherDesktopApp(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.subscribe(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("Weather Desktop App: temp :" +temp + " humidity: " + humidity + " pressure:" + pressure);
    }
}
