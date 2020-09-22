package inheritance;

import java.util.LinkedList;

public class Restaurant {

    private String name;
    private int stars = 0;
    private int priceCategory;
    private LinkedList<Review> reviewList = new LinkedList<>();

    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    // intelliJ suggestion
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory=" + priceCategory +
                ", reviewList=" + reviewList +
                '}';
    }

    public void addReview(Review review) {
        reviewList.addFirst(review);
        updateStars();
    }

    private void updateStars() {
        // intelliJ suggested this
        int total = reviewList.stream().mapToInt(Review::getStars).sum();
        stars = total / reviewList.size();
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public LinkedList<Review> getReviewList() {
        return reviewList;
    }
}
