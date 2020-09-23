package inheritance;

import java.util.LinkedList;

public class Restaurant extends Location {

    private int priceCategory;

    public Restaurant(String name, int priceCategory) {
        super(name);
        this.priceCategory = priceCategory;
    }

    // intelliJ suggestion
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + this.getName() + '\'' +
                ", stars=" + this.getStars() +
                ", priceCategory=" + this.getPriceCategory() +
                ", reviewList=" + this.getReviewList() +
                '}';
    }

    public String getPriceCategory() {
        String outputDollarSigns = "";
        for (int i = 0; i < priceCategory; i++) {
            outputDollarSigns += '$';
        }
        return outputDollarSigns;
    }

    public void addReview(TheaterReview review) throws Exception {
        // reference for getting a simple class name https://stackoverflow.com/questions/2690333/how-to-get-the-name-of-a-class-without-the-package
        System.out.println(String.format("Theater Reviews are not accepted by %ss.", this.getClass().getSimpleName()));
        throw new Exception("Movie reviews are not accepted");
    }
}
