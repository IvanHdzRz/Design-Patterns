import beverage.Beverage;
import beverage.DarkRoast;
import beverage.MilkDecorator;
import beverage.MochaDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        Beverage miCoffe= new DarkRoast();
        miCoffe.setSize(Beverage.Size.GRANDE);
        //decorate coffe
        miCoffe= new MochaDecorator(miCoffe);
        miCoffe= new MilkDecorator(miCoffe);
        miCoffe= new MochaDecorator(miCoffe);


        System.out.println("Product: "+miCoffe.getDescription());
        System.out.println("Price $"+miCoffe.getCost());

    }
}
