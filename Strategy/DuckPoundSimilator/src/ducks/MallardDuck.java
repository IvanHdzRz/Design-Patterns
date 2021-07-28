package ducks;

import duckBehaviors.FlyWithWings;
import duckBehaviors.Quack;


public class MallardDuck extends Duck{
    public MallardDuck(){
        this.flyStrategy= new FlyWithWings();
        this.quackStrategy= new Quack();
    }

    public void display(){
        System.out.println("soy un pato mallard");
    }
    
}
