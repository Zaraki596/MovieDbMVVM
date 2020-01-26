package com.droidplusplus.moviedbmvvm.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.droidplusplus.moviedbmvvm.data.model.Movie
import com.droidplusplus.moviedbmvvm.data.model.MovieDetails
import com.droidplusplus.moviedbmvvm.data.network.ApiService

class MovieRepositoryImpl(private val apiService: ApiService) : BaseRepository(), MovieRepository {

    override suspend fun getPopularMovies(): LiveData<List<Movie>>? {
        val mPopularResponse = MutableLiveData<List<Movie>>()
        val popularResponse = safeApiCall(
            call = { apiService.getPopularMovies() },
            errorMessage = "Error Fetching Popular Movies"
        )
        mPopularResponse.value = popularResponse?.movies
        return mPopularResponse
    }

    override suspend fun getMovieDetails(movieId: Int): LiveData<MovieDetails>? {
        val mMovieDetails = MutableLiveData<MovieDetails>()
        val movieDetails = safeApiCall(
            call = {apiService.getMovieDetais(movieId)},
            errorMessage = "Error fetching Movie Details"
        )
        mMovieDetails.value = movieDetails
        return mMovieDetails
    }


}