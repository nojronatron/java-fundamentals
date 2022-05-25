package inheritance;

public class Shop extends Business {
    public Shop(String name, int priceCategory) {
        super(name, priceCategory); // calls parent constructor
    }

    @Override
    public String toString() {
        return "Shop " + this.name + " price category is: " + this.priceCategory + " dollar signs.";
    }
}
