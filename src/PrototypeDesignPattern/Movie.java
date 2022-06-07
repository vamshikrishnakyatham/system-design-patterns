package PrototypeDesignPattern;
import java.util.*;

public class Movie implements Cloneable{
    private String movieName;
    private String releaseYear;
    private List<String> genre;
    private List<String> ratings;
    public Movie(){
        System.out.println("This is the default Constructor.");
    }
    public Movie(String movieName, String releaseDate, List<String> genre, List<String> ratings) {
        this.movieName = movieName;
        this.releaseYear = releaseDate;
        this.genre = genre;
        this.ratings = ratings;
    }
    public List<String> getGenre() {
        return genre;
    }
    public List<String> getRatings() {
        return ratings;
    }
    public void getData() {
        System.out.println("Fetching Movies data from the DB.");
        this.movieName = "RRR";
        this.releaseYear = "2022";
        this.genre = new ArrayList<String>();
        this.genre.add("Action");
        this.genre.add("Fiction");
        this.ratings = new ArrayList<String>();
        this.ratings.add("IMDB:9.1");
        this.ratings.add("RottenTomatoes:95%");
    }
    @Override
    public String toString() {
        return "[movieName="+movieName+",\n releaseDate="+releaseYear+",\n genre="+genre+",\n ratings="+ratings+"]";
    }
    @Override
    protected Movie clone() throws CloneNotSupportedException {
        List<String> Ratings = new ArrayList<>();
        Ratings.addAll(this.ratings);
        List<String> Genres = new ArrayList<>();
        Genres.addAll(this.genre);
        return new Movie(this.movieName, this.releaseYear, Genres, Ratings);
    }
}