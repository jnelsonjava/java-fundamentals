package inheritance;

import java.util.HashSet;

public class Theater extends Location {

    private HashSet<String> movieList = new HashSet<>();

    public Theater(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + this.getName() + '\'' +
                ", movieList=" + movieList +
                '}';
    }

    public void addMovie(String movie) {
        movieList.add(movie);
    }

    public void removeMovie(String movie) {
        movieList.remove(movie);
    }

    public HashSet<String> getMovieList() {
        return movieList;
    }
}
