import javax.swing.JOptionPane;

import observer.CurrentWeather;
import observer.Observer;
import observer.WeatherStatidistic;
import subject.Subject;
import subject.WeatherData;

public class App {
    public static void main(String[] args) throws Exception {
        Subject servicioDeClima= new WeatherData();
        Observer observadorDeTemperatura= new CurrentWeather(servicioDeClima);
        Observer estadisticas= new WeatherStatidistic(servicioDeClima);
        
        
        JOptionPane.showMessageDialog(null, "no cerrar");    
        

    }
}
