package observer;
import subject.Subject;
import subject.WeatherData;

public class CurrentWeather implements Observer{
    Subject observable;
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentWeather(Subject observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }
    
    public void update(Subject notifyingSubject){
        if(notifyingSubject instanceof WeatherData){
            WeatherData weatherService= (WeatherData)notifyingSubject;
            this.temperature = weatherService.getTemperature();
            this.humidity = weatherService.getHumidity();
            this.pressure = weatherService.getPressure();
            System.out.println("Temperatura: " + temperature + "c° Humedad: " + (humidity*100) + "% Presion " + pressure);
            if(this.temperature > 38){
                unSubscribe();
            }
        }
    }
    
    public void unSubscribe(){
        observable.removeObserver(this);
    }
}
