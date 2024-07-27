public class ChocolateDecorator extends CakeDecorator {
    private static final double CHOCOLATE_PRICE_INR = 400.00; 

    public ChocolateDecorator(Cake cake) {
        super(cake);
    }

   
    public String getDescription() {
        return cake.getDescription() + " + Chocolate";
    }

    public double getPrice() {
        return cake.getPrice() + CHOCOLATE_PRICE_INR;
    }
}