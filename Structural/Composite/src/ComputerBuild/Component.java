package ComputerBuild;

public abstract class Component {
    public String name = null;
    public int price = 0;
    boolean leaf = false;
    abstract public void showPrice();
}
