public class Main {
    public static void main(String[] args) {
        Cake cake = new BasicCake();
        System.out.printf("Description: %s\nPrice: Rs %.2f\n\n",
            cake.getDescription(), cake.getPrice());

        cake = new ChocolateDecorator(cake);
        System.out.printf("Description: %s\nPrice: Rs %.2f\n\n",
            cake.getDescription(), cake.getPrice());

        cake = new FruitDecorator(cake);
        System.out.printf("Description: %s\nPrice: Rs %.2f\n\n",
            cake.getDescription(), cake.getPrice());
    }
}
