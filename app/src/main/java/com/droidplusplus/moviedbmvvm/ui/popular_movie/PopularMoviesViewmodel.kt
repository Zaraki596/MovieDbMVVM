package com.droidplusplus.moviedbmvvm.ui.popular_movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.droidplusplus.moviedbmvvm.data.model.Movie
import com.droidplusplus.moviedbmvvm.data.repository.MovieRepositoryImpl
import kotlinx.coroutines.launch

class PopularMoviesViewmodel(private val movieRepository: MovieRepositoryImpl) : ViewModel() {

    private val _mLivedata: MutableLiveData<List<Movie>> = MutableLiveData()

    val mLivedata: LiveData<List<Movie>>
        get() {
            return _mLivedata
        }


    fun getMovies() {
        viewModelScope.launch {
          _mLivedata.postValue(movieRepository.getPopularMovies()?.value)
        }
    }
}