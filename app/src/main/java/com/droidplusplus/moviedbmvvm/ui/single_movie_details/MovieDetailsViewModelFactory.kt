package com.droidplusplus.moviedbmvvm.ui.single_movie_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droidplusplus.moviedbmvvm.repository.MovieRepositoryImpl

class MovieDetailsViewModelFactory(private val movieRepository: MovieRepositoryImpl) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieDetailsViewModel(movieRepository) as T
    }
}