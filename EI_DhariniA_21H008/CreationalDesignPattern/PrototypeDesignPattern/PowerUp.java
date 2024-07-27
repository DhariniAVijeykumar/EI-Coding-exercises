public class PowerUp implements GameObject {
    private String name;
    private int bonusValue;

    public PowerUp(String name, int bonusValue) {
        this.name = name;
        this.bonusValue = bonusValue;
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

    public int getBonusValue() {
        return bonusValue;
    }

    public void setBonusValue(int bonusValue) {
        this.bonusValue = bonusValue;
    }

    
    public String toString() {
        return "PowerUp [name=" + name + ", bonusValue=" + bonusValue + "]";
    }
}
