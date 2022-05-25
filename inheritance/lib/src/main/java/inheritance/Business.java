package inheritance;

import java.util.ArrayList;

public abstract class Business {
    public String name;
    public float stars;
    public int priceCategory;
    public ArrayList<Review> reviews;

    public Business(String businessName, int priceCategory) {
        this.name = businessName;
        this.priceCategory = priceCategory;
        this.stars = 0;
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
            System.out.println("The review could not be added due to an error: " + ex.getMessage());
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
