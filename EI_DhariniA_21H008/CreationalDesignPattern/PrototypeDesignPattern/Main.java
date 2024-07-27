public class Main {
    public static void main(String[] args) {
        // Create a prototype enemy
        Enemy prototypeEnemy = new Enemy("Goblin", 100, 15);
        // Clone the enemy to create new instances
        Enemy enemy1 = (Enemy) prototypeEnemy.clone();
        Enemy enemy2 = (Enemy) prototypeEnemy.clone();
        
        // Create a prototype power-up
        PowerUp prototypePowerUp = new PowerUp("Health Boost", 50);
        // Clone the power-up to create new instances
        PowerUp powerUp1 = (PowerUp) prototypePowerUp.clone();
        PowerUp powerUp2 = (PowerUp) prototypePowerUp.clone();
        
        // Print the details of the cloned objects
        System.out.println("Original Prototype Enemy: " + prototypeEnemy);
        System.out.println("Cloned Enemy 1: " + enemy1);
        System.out.println("Cloned Enemy 2: " + enemy2);

        System.out.println("Original Prototype PowerUp: " + prototypePowerUp);
        System.out.println("Cloned PowerUp 1: " + powerUp1);
        System.out.println("Cloned PowerUp 2: " + powerUp2);
        
        // Modify cloned instances to demonstrate independence
        enemy1.setName("Orc");
        enemy2.setHealth(80);
        powerUp1.setBonusValue(75);

        System.out.println("Modified Cloned Enemy 1: " + enemy1);
        System.out.println("Modified Cloned Enemy 2: " + enemy2);
        System.out.println("Modified Cloned PowerUp 1: " + powerUp1);
    }
}
