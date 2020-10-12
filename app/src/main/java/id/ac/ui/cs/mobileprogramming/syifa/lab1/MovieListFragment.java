package id.ac.ui.cs.mobileprogramming.syifa.lab1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import id.ac.ui.cs.mobileprogramming.syifa.lab1.viewmodels.MovieViewModel;

public class MovieListFragment extends Fragment {

    private MovieViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View list_view = inflater.inflate(R.layout.movie_list_fragment,
                container,
                false);

        this.viewModel = new ViewModelProvider(requireActivity())
                .get(MovieViewModel.class);

        ListView movie_listView = list_view.findViewById(R.id.movie_list);

        movie_listView.setAdapter(
                new ArrayAdapter<>(
                        this.getActivity(),
                        android.R.layout.simple_list_item_1,
                        this.viewModel.getMovieList()
                )
        );

        movie_listView.setOnItemClickListener((parent, itemView, position, id) -> {
            TextView textView = (TextView) itemView;
            this.viewModel.selectMovie(textView.getText().toString());
            ((MainActivity) requireActivity()).appendMovieInfoFragment();
        });

        return list_view;
    }


}
