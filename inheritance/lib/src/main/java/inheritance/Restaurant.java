package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int stars; // 1-5 rating
    int price; // 1-5 dollar signs
    ArrayList<Review> reviews;
    public Restaurant(String name) {
        this.name = name;
        stars = 0;
        price = 0;
        reviews = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Restaurant " + this.name + " has a star rating of " + stars +
                "and a price rating of " + price;
    }
}
