package inheritance;

public class Shop extends Business {
    public Shop(String name, int priceCategory) {
        super(name, priceCategory); // calls parent constructor
    }
}
