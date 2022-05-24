package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int stars; // 1-5 rating
    int priceCategory; // 1-5 dollar signs
    ArrayList<Review> reviews;
    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.stars = 0;
        this.priceCategory = priceCategory;
        reviews = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Restaurant " + this.name +
                " has a star rating of " + stars +
                "a list of " + this.reviews.size() +
                "reviews, and a price rating of " + priceCategory;
    }
}
