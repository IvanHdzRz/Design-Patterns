package beverage;


public class MilkDecorator extends BeverageDecorator {
    private double cost;
    private String description="milk";
    
    public MilkDecorator(Beverage beverage) {
        this.beverage=beverage;
        this.setSize(beverage.getSize());
    }

    
    public double getCost(){
        if(beverage.getSize().equals(Beverage.Size.TALL)){
            cost=0.10;
        }
        if(beverage.getSize().equals(Beverage.Size.GRANDE)){
            cost=0.15;
        }
        if(beverage.getSize().equals(Beverage.Size.VENTI)){
            cost=0.20;
        }
        return cost+beverage.getCost();
    }
    public String getDescription(){
        return this.beverage.getDescription()+" with "+description;
    }

}
