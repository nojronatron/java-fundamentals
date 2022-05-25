package inheritance;

public class Restaurant extends Business {
    public Restaurant(String name, int priceCategory) {
    super(name, priceCategory); // calls parent constructor
    }

}
