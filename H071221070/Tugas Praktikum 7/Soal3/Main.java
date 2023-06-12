package Soal3;

import java.util.ArrayList;
import java.util.List;

class FoodFactory {
    public static Food getFood(String food) {
        if (food.equals("burger")) {
            return new Burger();
        } else if (food.equals("pizza")) {
            return new Pizza();
        } else if (food.equals("steak")) {
            return new Steak();
        } else {
            return null;
            // throw new IllegalArgumentException("Invalid food type: " + food);
        }
    }
}

interface Food {
    public int getPrice();
}

class Burger implements Food {

    @Override
    public int getPrice() {
        return 35000;
    }
}

class Pizza implements Food {
    
    @Override
    public int getPrice() {
        return 80000;
    }
}

class Steak implements Food {
    
    @Override
    public int getPrice() {
        return 100000;
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        for (Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");
        

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
    }
}