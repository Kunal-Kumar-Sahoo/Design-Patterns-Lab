package FoodOrderingSystem;

public class Waiter {
    public static String deliverFood(FoodType foodType) {
        Ingredient ingredients = new Ingredient();
        switch (foodType) {
            case PASTA:
                Food pasta = new Pasta();
                String pastaIngredients = ingredients.getPastaItems();
                pasta.prepareFood(pastaIngredients);
                return pasta.deliverFood();

            case PIZZA:
                Food pizza = new Pizza();
                String pizzaIngredients = ingredients.getPastaItems();
                pizza.prepareFood(pizzaIngredients);
                return pizza.deliverFood();
        }
        return null;
    }
}
