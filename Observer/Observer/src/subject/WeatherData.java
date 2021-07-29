package subject;
import observer.Observer;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
public class WeatherData extends Subject{
    private int temperature;
    
    public WeatherData(){
        //al construir la clase de manera inmedita iniciara un timer
        //que actualizara el valor de la temepartura cada 5 segundos
        Timer interval = new Timer(5000,new generateRandomTemp());
        interval.start();
        this.observers= new ArrayList<Observer>();
    }
    
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    public void updateObservers(){
        this.observers
            .forEach(o->o.update(this.temperature));
    }
    
    class generateRandomTemp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //genera numero random entre 35 y 40
            temperature=(int)(Math.random()*5+35);
            updateObservers();
        }
    }

}


