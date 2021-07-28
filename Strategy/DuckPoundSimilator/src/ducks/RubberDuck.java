package ducks;

import duckBehaviors.FlyNoWay;
import duckBehaviors.Squesy;

public class RubberDuck extends Duck  {
    public RubberDuck(){
        this.flyStrategy=new FlyNoWay();
        this.quackStrategy= new Squesy();
    }

    public void display(){
        System.out.println("soy un pato de hule uwu");
    }

}
