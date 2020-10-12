package id.ac.ui.cs.mobileprogramming.syifa.lab1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String INFO_MOVIE_NAME = "MovieInfoFragment";
    public static final String LIST_MOVIE_NAME = "MovieListFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            Log.i(" onCreate", "savedInstanceState = null");

            MovieListFragment fragment = new MovieListFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, fragment, LIST_MOVIE_NAME)
                    .commit();
        }
    }

    public void appendMovieInfoFragment() {
        MovieInfoFragment fragment = new MovieInfoFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment, INFO_MOVIE_NAME)
                .addToBackStack(INFO_MOVIE_NAME)
                .commit();
    }
}