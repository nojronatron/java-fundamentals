package inheritance;

public class User {
    public String name;
    public int reviewsWritten;

    public User (String name) {
        this.name = name;
        this.reviewsWritten = 0;
    }

    @Override
    public String toString(){
        return "User: " + this.name + " has created " + this.reviewsWritten + " reviews.";
    }
}
