package FoodOrderingSystem;

public class Pizza implements Food {
    String preparedItems;

    @Override
    public void prepareFood(String itemsRequired) {
        this.preparedItems = "Thin crust pizza with: " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return this.preparedItems;
    }
}
