package subject;
import observer.Observer;
import javax.swing.Timer;

import java.util.*;
public class WeatherData extends Subject{
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(){
        //al construir la clase de manera inmedita iniciara un timer
        //que actualizara el valor del clima cada 5 segundos
        Timer interval = new Timer(5000,e->{
            temperature=Math.random()*5+35;
            pressure=Math.random()*2+1;
            humidity=Math.random();

            updateObservers();
        });
        interval.start();
        this.observers= new ArrayList<Observer>();
    }
    
    //getters for pulling data from the WeatherData
    public double getTemperature(){
        return temperature;
    }
    public double getHumidity(){
        return humidity;
    }
    public double getPressure(){
        return pressure;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        if(this.observers.contains(observer)){
            this.observers.remove(observer);
        }
        
    }
    public void updateObservers(){
        List<Observer> observersToNotify =new ArrayList<Observer>(this.observers);
        
        observersToNotify
            .forEach(observer->observer.update(this)); 
    }

    
    

}


