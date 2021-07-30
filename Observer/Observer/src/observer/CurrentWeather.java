package observer;

import subject.Subject;

public class CurrentWeather implements Observer{
    Subject observable;
    
    public CurrentWeather(Subject observable){
        this.observable = observable;
    }
    
    public void update(int temperature){
        System.out.println("la temperatura actual es: "+temperature);
        if(temperature==38){
            System.out.println("me voy");
            unSubscribe();
        }
    }
    
    public void unSubscribe(){
        observable.removeObserver(this);
    }
}
