public class FruitDecorator extends CakeDecorator {
    private static final double FRUIT_PRICE_INR = 560.00; 

    public FruitDecorator(Cake cake) {
        super(cake);
    }

  
    public String getDescription() {
        return cake.getDescription() + " + Fruit";
    }

    public double getPrice() {
        return cake.getPrice() + FRUIT_PRICE_INR;
    }
}