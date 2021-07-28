
import ducks.RubberDuck;
import duckBehaviors.FlyWithWings;
import ducks.Duck;
import ducks.MallardDuck;
public class App {
    public static void main(String[] args) throws Exception {
        Duck myDuck = new RubberDuck();
        myDuck.display();
        myDuck.performFly();
        myDuck.performQuack();
        myDuck.setFlyBehavior( new FlyWithWings());
        myDuck.performFly();

        Duck otherDuck= new MallardDuck();
        otherDuck.display();
        otherDuck.performFly();
        otherDuck.performQuack();
        //other class no related with duck but implement one o his behaviors
        var duckCall = new DuckCall();
        System.out.println("llamdo de silvato de caceria");
        duckCall.perfomQuack();
    }
}
