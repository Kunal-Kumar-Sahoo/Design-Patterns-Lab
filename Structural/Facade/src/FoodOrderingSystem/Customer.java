package FoodOrderingSystem;

public class Customer {
    public static void main(String[] args) {
        System.out.println("----Without Facade----");
        Ingredient ingredients = new Ingredient();
        Food pasta = new Pasta();
        String pastaIngredients = ingredients.getPastaItems();
        pasta.prepareFood(pastaIngredients);
        System.out.println(pasta.deliverFood());

        Food pizza = new Pizza();
        String pizzaIngredients = ingredients.getPastaItems();
        pizza.prepareFood(pizzaIngredients);
        System.out.println(pizza.deliverFood());

        System.out.println("----With Facade----");
        System.out.println(Waiter.deliverFood(FoodType.PIZZA));
        System.out.println(Waiter.deliverFood(FoodType.PASTA));
    }
}
