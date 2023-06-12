import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice();
}

class Burger implements Food {
    protected int price;

    public Burger(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    protected int price;

    public Pizza(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    protected int price;

    public Steak(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {
        switch (type.toLowerCase()) {
            case "burger":
                return new Burger(25);
            case "pizza":
                return new Pizza(65);
            case "steak":
                return new Steak(88);
            default:
                throw new IllegalArgumentException("Invalid food type: " + type);
        }
    }
}

class Restaurant {
    static int calculateTotal(List<Food> foods) {
        int total = 0;
        
        for (Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}

public class No3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);
        System.out.println("Total harga : " + total);
    }
}
