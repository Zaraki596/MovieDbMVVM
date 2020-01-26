package com.droidplusplus.moviedbmvvm.data.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val API_KEY = "78a2bb2cf3f1ba8fa0536512b78cface"
const val TMDB_BASE_URL = "https://api.themoviedb.org/3/"
const val TMDB_IMAGEURL = "https://image.tmdb.org/t/p/w500/"

object RetrofitClient {

    fun getClient(): ApiService {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .callTimeout(1, TimeUnit.MINUTES)
            .build()

        return Retrofit.Builder()
            .baseUrl(TMDB_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(ApiService::class.java)
    }
}