public interface GameObject extends Cloneable {
    GameObject clone();
    String getName();
    void setName(String name);
}
