package id.ac.ui.cs.mobileprogramming.syifa.lab1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import id.ac.ui.cs.mobileprogramming.syifa.lab1.models.Movie;
import id.ac.ui.cs.mobileprogramming.syifa.lab1.viewmodels.MovieViewModel;

public class MovieInfoFragment extends Fragment {
    private MovieViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                        R.layout.movie_info_fragment,
                        container,
                        false);

        final TextView movieTitle_textView = view.findViewById(R.id.movie_title);
        final TextView movieDirector_textView = view.findViewById(R.id.movie_director);
        final TextView movieWriter_textView = view.findViewById(R.id.movie_writer);
        final TextView movieStar_textView = view.findViewById(R.id.movie_cast);

        this.viewModel = new ViewModelProvider(requireActivity()).get(MovieViewModel.class);
        this.viewModel
                .getSelectedMovie()
                .observe(getViewLifecycleOwner(),
                        new Observer<String>() {
                            @Override
                            public void onChanged(String item) {
                                Movie movie = viewModel.getMovieInfo(item);
                                Log.i(" onChanged - getMovieInfo", item);

                                movieTitle_textView.setText(movie.getTitle());
                                movieDirector_textView.setText("Director : " + movie.getDirectors());
                                movieWriter_textView.setText("Writers : " + movie.getWriters());
                                movieStar_textView.setText("Stars : " + movie.getCasts());
                            }
                        });

        return view;

    }
}
