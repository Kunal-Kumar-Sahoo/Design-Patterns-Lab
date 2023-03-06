package FoodOrderingSystem;

public class Pasta implements Food {
    String preparedItems;

    @Override
    public void prepareFood(String itemsRequired) {
        this.preparedItems = "Pasta with: " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return this.preparedItems;
    }
}
