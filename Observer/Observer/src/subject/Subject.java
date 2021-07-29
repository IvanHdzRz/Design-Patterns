package subject;
import java.util.*;
import observer.Observer;

public abstract class Subject {
    public List<Observer> observers;
    public abstract void addObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void updateObservers();

}
