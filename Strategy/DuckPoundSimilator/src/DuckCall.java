import duckBehaviors.QuackBehavior;
import duckBehaviors.Quack;
public class DuckCall {
    QuackBehavior quackBehavior;
    public DuckCall(){

        this.quackBehavior=new Quack();
    }

    public void perfomQuack(){
        quackBehavior.quack();
    }
}
