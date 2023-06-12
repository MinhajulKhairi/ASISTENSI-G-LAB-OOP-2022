import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice();
}

class Burger implements Food {
    protected int price = 35;

    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    protected int price = 60;

    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    protected int price = 40;

    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {
        if (type.equalsIgnoreCase("burger")) {
            return new Burger();
        } else if (type.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("steak")) {
            return new Steak();
        } else {
            return null;
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

public class assignment_7_3_soaljava {
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