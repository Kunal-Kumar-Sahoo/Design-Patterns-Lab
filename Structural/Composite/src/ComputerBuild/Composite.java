package ComputerBuild;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    public List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
        this.price = 0;
        this.leaf = false;
    }

    public void addComponent(Component[] components) {
        for(Component component: components)
            this.componentList.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(this.name + ":");
        System.out.println("-------------------------------------");
        for(Component component: componentList)
            component.showPrice();
        System.out.println("Total: " + this.price);
        System.out.println("-------------------------------------");

    }

    public void getPrice() {
        
    }
}
