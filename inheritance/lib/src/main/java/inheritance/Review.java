package inheritance;

public class Review {
    String body;
    User author;
    int stars;
    public Review(User author, String reviewBody, int starsRating) {
        this.author = author;
        this.body = reviewBody;
        this.stars = starsRating;
    }

    @Override
    public String toString() {
        return "Author " + this.author.name +
                " voted " + stars +
                " stars, and wrote the following review: " + this.body;
    }
}
