package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    float stars; // 1-5 rating
    int priceCategory; // 1-5 dollar signs
    ArrayList<Review> reviews;
    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.stars = 0f;
        this.priceCategory = priceCategory;
        reviews = new ArrayList<>();
    }

    public boolean addReview(Review review) {
        try {
            reviews.add(review);
            int sum = 0;

            for(Review thisReview: reviews) {
                sum += thisReview.stars;
            }

            stars = (float) sum / reviews.size();

        } catch (Exception ex) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Restaurant " + this.name +
                " has a star rating of " + stars +
                " a list of " + this.reviews.size() +
                " reviews, and a price rating of " + priceCategory;
    }
}
