package observer;
import java.util.*;
public class WeatherStatidistic implements Observer{
    private List<Integer> historicTemps;
    public WeatherStatidistic(){
        this.historicTemps=new ArrayList<Integer>();
    }
    public void update(int temperature){
        historicTemps.add(temperature);
        
        OptionalDouble avg=historicTemps.stream()
            .mapToInt(Integer::intValue) //no se porque hay que usar este
            .average();

        System.out.println("la temperatura promedio es: "+(avg.isPresent()?avg.getAsDouble():"--sin datos--" ));
    }
}
