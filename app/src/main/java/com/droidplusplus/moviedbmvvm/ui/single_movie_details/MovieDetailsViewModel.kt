package com.droidplusplus.moviedbmvvm.ui.single_movie_details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.droidplusplus.moviedbmvvm.data.model.MovieDetails
import com.droidplusplus.moviedbmvvm.repository.MovieRepositoryImpl
import kotlinx.coroutines.launch

class MovieDetailsViewModel(private val movieRepository: MovieRepositoryImpl) : ViewModel() {

    private val _movieDetails: MutableLiveData<MovieDetails> = MutableLiveData()

    val movieDetails : LiveData<MovieDetails>
        get() {
            return _movieDetails
        }

    //Creating method to get the movie details
    fun getMovieDetails(movieId : Int){
        viewModelScope.launch {
            _movieDetails.postValue(movieRepository.getMovieDetails(movieId)?.value)
        }
    }
}