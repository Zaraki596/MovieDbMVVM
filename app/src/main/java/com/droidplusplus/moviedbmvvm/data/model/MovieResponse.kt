package com.droidplusplus.moviedbmvvm.data.model

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("total_results")
    var totalResults: Int? = null,
    @SerializedName("total_pages")
    var totalPages: Int? = null,
    @SerializedName("results")
    var movies: List<Movie>? = null
)

data class Movie(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("original_title") var title: String? = null,
    @SerializedName("vote_average") var vote_average: Double? = null,
    @SerializedName("poster_path") var posterPath: String? = null,
    @SerializedName("release_date") var release_date: String? = null
)

data class MovieDetails(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("original_title") var title: String? = null,
    @SerializedName("overview") var overview: String? = null,
    @SerializedName("original_language") var language: String? = null,
    @SerializedName("release_date") var release_date: String? = null,
    @SerializedName("poster_path") var posterPath: String? = null,
    @SerializedName("backdrop_path") var backPath: String? = null,
    @SerializedName("runtime") var runtime: Int? = null,
    @SerializedName("status") var status: String? = null,
    @SerializedName("budget") var budget: Long? = null,
    @SerializedName("vote_average") var vote_average: Double? = null,
    @SerializedName("revenue") var revenue: Long? = null,
    @SerializedName("tagline") var tagline: String? = null

)