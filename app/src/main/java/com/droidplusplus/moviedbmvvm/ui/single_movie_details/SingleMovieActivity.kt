package com.droidplusplus.moviedbmvvm.ui.single_movie_details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.droidplusplus.moviedbmvvm.R
import com.droidplusplus.moviedbmvvm.data.model.MovieDetails
import com.droidplusplus.moviedbmvvm.data.network.RetrofitClient
import com.droidplusplus.moviedbmvvm.databinding.ActivitySingleMovieBinding
import com.droidplusplus.moviedbmvvm.repository.MovieRepositoryImpl

class SingleMovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySingleMovieBinding
    private lateinit var movieDetailsViewModel: MovieDetailsViewModel
    private var id: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_single_movie)

        //Getting Instance ViewModel
        movieDetailsViewModel = ViewModelProvider(
            this, MovieDetailsViewModelFactory(
                MovieRepositoryImpl(RetrofitClient.getClient())
            )
        ).get(MovieDetailsViewModel::class.java)


        intent?.let {
            id = it.getIntExtra("ITEM_ID", 0)
        }

        if (id != 0) {
            //Getting data from the view model
            movieDetailsViewModel.getMovieDetails(id)

            //Observing the changes to data and updating the data according to it
            movieDetailsViewModel.movieDetails.observe(this, Observer {
                updateUi(it)
            })
        }

    }

    private fun updateUi(response: MovieDetails?) {
        response?.let {
            binding.item = it
        }
    }
}
