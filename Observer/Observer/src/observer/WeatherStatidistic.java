package observer;
import java.util.*;
import subject.Subject;
import subject.*;
public class WeatherStatidistic implements Observer{
    private List<Double> historicTemps;
    private Subject observable;
    
    public WeatherStatidistic(Subject observable){
        this.historicTemps=new ArrayList<Double>();
        this.observable=observable;
    }
    
    public void update(Subject notifyingSubject){
        
        if(notifyingSubject instanceof WeatherData){
            WeatherData weatherService= (WeatherData)notifyingSubject;
            historicTemps.add(weatherService.getTemperature());
            
            OptionalDouble avg=historicTemps.stream()
                .mapToDouble(Double::doubleValue) //no se porque hay que usar este
                .average();
    
            System.out.println("la temperatura promedio es: "+(avg.isPresent()?avg.getAsDouble():"--sin datos--" ));

        }
    }
    
    public void unSubscribe(){
        observable.removeObserver(this);
    }
}
