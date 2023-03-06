package ComputerBuild;

public class Leaf extends Component {
    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
        this.leaf = true;
    }

    @Override
    public void showPrice() {
        System.out.println(this.name + ": " + this.price);
    }
}
