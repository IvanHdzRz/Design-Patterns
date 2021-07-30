package subject;
import observer.Observer;
import javax.swing.Timer;

import java.util.*;
public class WeatherData extends Subject{
    private int temperature;
    
    public WeatherData(){
        //al construir la clase de manera inmedita iniciara un timer
        //que actualizara el valor de la temepartura cada 5 segundos
        Timer interval = new Timer(5000,e->{
            temperature=(int)(Math.random()*5+35);
            updateObservers();
        });
        interval.start();
        this.observers= new ArrayList<Observer>();
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
            .forEach(observer->observer.update(temperature));
    }
    
    

}


