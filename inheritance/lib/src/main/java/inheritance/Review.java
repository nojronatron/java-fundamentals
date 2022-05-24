package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    public Review(String authorName, String reviewBody, int starsRating) {
        this.author = authorName;
        this.body = reviewBody;
        this.stars = starsRating;
    }

    @Override
    public String toString() {
        return "Author " + this.author + "gave " + stars + " stars, and wrote the following review " + this.body + ".";
    }
}
