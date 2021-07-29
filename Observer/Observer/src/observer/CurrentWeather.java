package observer;

public class CurrentWeather implements Observer{
    public void update(int temperature){
        System.out.println("la temperatura actual es: "+temperature);
    }
}
