package inheritance;

import java.util.LinkedList;

public class Location {
    private String name;
    private int stars;
    private LinkedList<Review> reviewList = new LinkedList<>();

    public Location(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", reviewList=" + reviewList +
                '}';
    }

    public void addReview(Review review) {
        reviewList.addFirst(review);
        updateStars();
    }

    private void updateStars() {
        int total = reviewList.stream().mapToInt(Review::getStars).sum();
        stars = total / reviewList.size();
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public LinkedList<Review> getReviewList() {
        return reviewList;
    }
}
