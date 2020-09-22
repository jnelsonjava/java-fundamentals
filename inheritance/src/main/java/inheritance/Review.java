package inheritance;

public class Review {

    private String author;
    private String body;
    private int stars;
    private Restaurant restaurant;

    public Review(String author, String body, int stars, Restaurant restaurant) {
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.restaurant = restaurant;

        restaurant.addReview(this);
    }

    @Override
    public String toString() {
        return "Review{" +
                "restaurant='" + restaurant.getName() + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                ", body='" + body + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public int getStars() {
        return stars;
    }
}
