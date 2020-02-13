package com.droidplusplus.moviedbmvvm.ui.popular_movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droidplusplus.moviedbmvvm.repository.MovieRepositoryImpl

class PopularMoviesViewmodelFactory(private val movieRepository: MovieRepositoryImpl) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PopularMoviesViewmodel(
            movieRepository
        ) as T
    }
}