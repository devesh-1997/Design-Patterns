package observer;

import java.util.HashSet;

public class WeatherData implements Subject{

    private HashSet<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.observers = new HashSet<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public double getTemperature(){
        return temperature;
    }

    public double getHumidity(){
        return humidity;
    }

    public double getPressure(){
        return pressure;
    }

    public void setTemperature(double newTemp){
        temperature = newTemp;
        notifyObservers();
    }

    public void setHumidity(double newHumidity){
        humidity = newHumidity;
        notifyObservers();
    }

    public void setPressure(double newPressure) {
        pressure = newPressure;
        notifyObservers();
    }
}
