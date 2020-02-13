package com.droidplusplus.moviedbmvvm.repository

import androidx.lifecycle.LiveData
import com.droidplusplus.moviedbmvvm.data.model.Movie
import com.droidplusplus.moviedbmvvm.data.model.MovieDetails

interface MovieRepository {
    suspend fun getPopularMovies(): LiveData<List<Movie>>?

    suspend fun getMovieDetails(movieId : Int): LiveData<MovieDetails>?

}