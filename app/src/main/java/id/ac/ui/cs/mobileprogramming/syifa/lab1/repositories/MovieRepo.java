package id.ac.ui.cs.mobileprogramming.syifa.lab1.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import id.ac.ui.cs.mobileprogramming.syifa.lab1.models.Movie;

public class MovieRepo {
    private HashMap<String, Movie> movies = new HashMap<>();

    private static MovieRepo instance;

    private MovieRepo() {
        Movie[] movie_list = new Movie[]{
                new Movie(
                        "Inception (2010)",
                        "Christopher Nolan",
                        "Christopher Nolan",
                        "Leonardo DiCaprio"
                ),
                new Movie(
                        "Free Solo (2018)",
                        "Jimmy Chin",
                        "Jimmy Chin",
                        "Alex Honnold"
                ),
                new Movie(
                        "Knives Out (2019)",
                        "Rian Johnson",
                        "Rian Johnson",
                        "Daniel Craig, Chris Evans, Ana de Armas"
                ),
                new Movie(
                        "The Social Dilemma (2020)",
                        "Jeff Orlowski",
                        "Davis Coombe, Vickie Curtis",
                        "Tristan Harris, Jeff Seibert, Bailey Richardson"
                ),
                new Movie(
                        "Enola Holmes (2020)",
                        "Harry Bradbeer",
                        "Jack Thorne and Nancy Springer",
                        "Millie Bobby Brown, Henry Cavill, Sam Claflin"
                ),

        };
        for (Movie movies : movie_list) {
            this.movies.put(movies.getTitle(), movies);
        }
    }

    public static MovieRepo getInstance() {
        if (instance == null) {
            instance = new MovieRepo();
        }
        return instance;
    }

    public List<String> getMovieList() {
        return this.movies.values()
                .stream()
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

    public Movie getMovieInfo(String title) {
        return this.movies.get(title);
    }
}