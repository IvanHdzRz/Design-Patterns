package beverage;

public class DarkRoast extends Beverage {
    private double cost;
    private String description="Dark Roast Coffee";
    public double getCost(){
        if(this.getSize().equals(Beverage.Size.TALL)){
            cost=0.89;
        }
        if(this.getSize().equals(Beverage.Size.GRANDE)){
            cost=0.99;
        }
        if(this.getSize().equals(Beverage.Size.VENTI)){
            cost=1.29;
        }
        return this.cost;
    }
    public String getDescription(){
        return this.description;
    }
}