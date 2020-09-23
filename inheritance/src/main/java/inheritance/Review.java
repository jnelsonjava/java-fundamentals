package inheritance;

public class Review {

    private String author;
    private String body;
    private int stars;
    private Location location;

    public Review(String author, String body, int stars, Location location) {
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.location = location;

        location.addReview(this);
    }

    @Override
    public String toString() {
        return "Review{" +
                "location='" + location.getName() + '\'' +
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

    public Location getLocation() {
        return location;
    }
}
