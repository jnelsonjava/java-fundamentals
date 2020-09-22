package inheritance;

import java.util.LinkedList;

public class Restaurant {

    String name;
    int stars;
    int priceCategory;
    LinkedList<Review> reviewList = new LinkedList<>();

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
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
        int total = reviewList.stream().mapToInt(review -> review.stars).sum();
        stars = total / reviewList.size();
    }
}
