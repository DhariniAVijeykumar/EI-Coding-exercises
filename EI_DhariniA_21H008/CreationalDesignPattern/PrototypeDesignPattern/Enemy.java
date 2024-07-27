public class Enemy implements GameObject {
    private String name;
    private int health;
    private int attackPower;

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    
    public GameObject clone() {
        try {
            return (GameObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    
    public String toString() {
        return "Enemy [name=" + name + ", health=" + health + ", attackPower=" + attackPower + "]";
    }
}
