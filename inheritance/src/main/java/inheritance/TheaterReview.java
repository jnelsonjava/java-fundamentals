package inheritance;

public class TheaterReview extends Review{
    private String movie;

    public TheaterReview(String author, String body, int stars, Location location, String movie) {
        super(author, body, stars, location);
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "TheaterReview{" +
                "location='" + this.getLocation().getName() + '\'' +
                ", author='" + this.getAuthor() + '\'' +
                ", stars=" + this.getStars() +
                ", movie='" + this.getMovie() + '\'' +
                ", body='" + this.getBody() + '\'' +
                '}';
    }

    public String getMovie() {
        return movie;
    }
}
