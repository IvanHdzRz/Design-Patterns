package beverage;

public abstract class BeverageDecorator extends Beverage {
    protected Beverage beverage;
   
    
    public abstract String getDescription() ;
    public abstract double getCost();
}
