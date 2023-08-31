public class Burger {
    public String bun;
    public String meat;
    public String veggies;
    public String cheese;
    public boolean mayo;


    public Burger(String bun, String meat, String veggies, String cheese, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.mayo = mayo;
        this.veggies = veggies;
    }

    public Burger(String bun, String meat, String veggies, String cheese) {
        this(bun, meat, veggies, cheese, true);
    }

    public Burger(String bun, String meat, String veggies, String cheese, boolean mayo, boolean doubleMeat) {
        this.bun = bun;
        this.meat = doubleMeat ? "Double" + meat : meat;
        this.cheese = cheese;
        this.mayo = mayo;
        this.veggies = veggies;
    }

    @Override
    public String toString() {
        String mayoStatus = mayo ? "Yes" : "No";
        return "Burger Ingredients:\n" +
                "Bun:" + bun + "\n" +
                "Meat:" + meat + "\n" +
                "Cheese:" + cheese + "\n" +
                "Veggies:" + veggies + "\n" +
                "Mayo:" + mayoStatus;
    }
}