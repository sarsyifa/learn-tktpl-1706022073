package id.ac.ui.cs.mobileprogramming.syifa.lab1.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import id.ac.ui.cs.mobileprogramming.syifa.lab1.models.Movie;
import id.ac.ui.cs.mobileprogramming.syifa.lab1.repositories.MovieRepo;

public class MovieViewModel extends ViewModel {
    private final MutableLiveData<String> selectedMovie = new MutableLiveData<>();

    private final MovieRepo movie_repository = MovieRepo.getInstance();

    public void selectMovie(String title) {
        this.selectedMovie.setValue(title);
    }

    public List<String> getMovieList() {
        return this.movie_repository.getMovieList();
    }

    public Movie getMovieInfo(String title) {
        return this.movie_repository.getMovieInfo(title);
    }

    public LiveData<String> getSelectedMovie() {
        return this.selectedMovie;
    }


}
