import javax.swing.JOptionPane;

import observer.CurrentWeather;
import observer.Observer;
import observer.WeatherStatidistic;
import subject.Subject;
import subject.WeatherData;

public class App {
    public static void main(String[] args) throws Exception {
        Subject servicioDeClima= new WeatherData();
        Observer observadorDeTemperatura= new CurrentWeather();
        Observer estadisticas= new WeatherStatidistic();
        servicioDeClima.addObserver(observadorDeTemperatura);
        servicioDeClima.addObserver(estadisticas);
        JOptionPane.showMessageDialog(null, "no cerrar");    
    }
}
