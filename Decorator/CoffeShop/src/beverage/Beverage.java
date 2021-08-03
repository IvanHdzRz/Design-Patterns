package beverage;

public abstract class Beverage {
    public enum Size{TALL,GRANDE,VENTI}
    private Size size=Size.TALL;
    public Size getSize(){
        return this.size;
    }
    public Size setSize(Size size){
        return this.size=size;
    }

    public abstract double getCost();
    public abstract String getDescription() ;
}
