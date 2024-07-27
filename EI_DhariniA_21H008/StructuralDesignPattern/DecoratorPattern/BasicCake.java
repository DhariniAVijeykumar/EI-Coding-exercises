public class BasicCake implements Cake {
    private static final double PRICE_INR = 1600.00; 

    public String getDescription() {
        return "Basic Cake";
    }


    public double getPrice() {
        return PRICE_INR;
    }
}