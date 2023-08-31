public class BurgerMain {

    public static void main(String[] args) {
    Burger regularBurger = new Burger("Regular bun", "Beef Patty",  "Lettuce, Tomato, Onion", "Cheddar Cheese");
    Burger dietBurger = new Burger("Whole Wheat bun", "Chicken Patty", "Lettuce, Tomato, Onion", "Swiss Cheese", false);
    Burger doubleMeatBurger = new Burger("Sesame bun", "Beef Patty", "Lettuce, Pickle", "American cheese", true);
    System.out.println("Regular Burger:");
    System.out.println(regularBurger);
    System.out.println();
    System.out.println("Diet Burger:");
    System.out.println(dietBurger);
    System.out.println();
    System.out.println("Double Meat Burger:");
    System.out.println(doubleMeatBurger);
    System.out.println();
    }
}