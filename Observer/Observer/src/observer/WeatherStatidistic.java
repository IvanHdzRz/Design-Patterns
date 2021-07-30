package observer;
import java.util.*;
import subject.Subject;
public class WeatherStatidistic implements Observer{
    private List<Integer> historicTemps;
    private Subject observable;
    
    public WeatherStatidistic(Subject observable){
        this.historicTemps=new ArrayList<Integer>();
        this.observable=observable;
    }
    
    public void update(int temperature){
        historicTemps.add(temperature);
        
        OptionalDouble avg=historicTemps.stream()
            .mapToInt(Integer::intValue) //no se porque hay que usar este
            .average();

        System.out.println("la temperatura promedio es: "+(avg.isPresent()?avg.getAsDouble():"--sin datos--" ));
    }
    
    public void unSubscribe(){
        observable.removeObserver(this);
    }
}
