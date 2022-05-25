package inheritance;

import java.util.ArrayList;

public class Theater extends Business {
    ArrayList<String> moviesShowing;

    public Theater (String name, int priceCategory) {
        super(name, priceCategory); // calls parent constructor
        this.moviesShowing = new ArrayList<>();
    }

    public boolean addMovie(String title) {
        // attempts to add a new Movie by string title supplied by caller if it is not already in the list
        try {
            // note the teencyweency exclamation mark negating the following conditional...
            if (!moviesShowing.contains(title)) {
                moviesShowing.add(title);
            }
        } catch (Exception ex) {
            System.out.println("Movie not added due to a problem: " + ex.getMessage());
            return false;
        }

        return true;
    }

    public boolean removeMovie(String title) {
        // attempts to remove a movie title from the arraylist as supplied by caller
        try{
            moviesShowing.remove(title);
        } catch (Exception ex) {
            System.out.println("Movie not removed due to a problem: " + ex.getMessage());
            return false;
        }

        return true;
    }
}
