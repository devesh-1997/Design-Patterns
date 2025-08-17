package observer;

public class Driver {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(35.0, 80, 1);
        WeatherMobileApp weatherMobileApp = new WeatherMobileApp(weatherData);
        WeatherDesktopApp weatherDesktopApp = new WeatherDesktopApp(weatherData);


        weatherData.setHumidity(2);

    }
}
