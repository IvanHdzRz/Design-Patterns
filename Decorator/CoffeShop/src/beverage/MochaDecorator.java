package beverage;

public class MochaDecorator extends BeverageDecorator {
    private double cost;
    private String description="Mocha";
    public MochaDecorator(Beverage beverage){
        this.beverage=beverage;
        this.setSize(beverage.getSize());
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription()+" with "+this.description;
    }
    public double getCost(){
        if(beverage.getSize().equals(Beverage.Size.TALL)){
            cost=0.20;
        }
        if(beverage.getSize().equals(Beverage.Size.GRANDE)){
            cost=0.25;
        }
        if(beverage.getSize().equals(Beverage.Size.VENTI)){
            cost=0.30;
        }
        return this.cost+this.beverage.getCost();
    }

}
