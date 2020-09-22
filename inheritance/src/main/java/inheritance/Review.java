package inheritance;

public class Review {

    String author;
    String body;
    int stars;

    public Review(String author, String body, int stars) {
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", stars=" + stars +
                ", body='" + body + '\'' +
                '}';
    }
}
