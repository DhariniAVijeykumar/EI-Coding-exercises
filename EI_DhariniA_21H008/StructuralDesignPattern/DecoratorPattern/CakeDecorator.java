public abstract class CakeDecorator implements Cake {
    protected Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

   
    public String getDescription() {
        return cake.getDescription();
    }

    
    public double getPrice() {
        return cake.getPrice();
    }
}