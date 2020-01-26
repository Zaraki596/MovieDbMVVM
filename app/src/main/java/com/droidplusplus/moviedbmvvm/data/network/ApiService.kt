package com.droidplusplus.moviedbmvvm.data.network

import com.droidplusplus.moviedbmvvm.data.model.MovieDetails
import com.droidplusplus.moviedbmvvm.data.model.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    //reference Url
    //https://api.themoviedb.org/3/movie/popular?api_key=78a2bb2cf3f1ba8fa0536512b78cface&language=en-US&page=1
    //https://api.themoviedb.org/3/movie/299534?api_key=78a2bb2cf3f1ba8fa0536512b78cface

    //Wrapped in Response Class So that can handle Success or Error of the network request.
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") api_key: String = API_KEY): Response<MovieResponse>

    @GET("movie/{movie_id}")
    suspend fun getMovieDetais(@Path("movie_id") movie_id: Int, @Query("api_key") api_key: String = API_KEY): Response<MovieDetails>

    @GET("search/movie")
    suspend fun searchMovie(@Query("api_key") api_key: String = API_KEY, @Query("query") q: String): Response<MovieResponse>

}