package ducks;
import duckBehaviors.QuackBehavior;
import duckBehaviors.FlyBehavior;

public abstract class Duck {
    //super types delegates behaviors iplementation
    protected QuackBehavior quackStrategy;
    protected FlyBehavior flyStrategy;
    //default constructor 
    public Duck(){

    }
    //show a duck
    public abstract void display();
    //executes a especific quack behavior
    public void performQuack(){
        quackStrategy.quack();
    }
    //executes a especific fly behavior
    public void performFly(){
        flyStrategy.fly();
    }
    //change especific fly implementation
    public void setFlyBehavior(FlyBehavior flyStrategy){
        this.flyStrategy=flyStrategy;
    }
    public void swim(){
        System.out.println("nado como un pato");
    }

}
