package com.droidplusplus.moviedbmvvm.ui.popular_movie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.droidplusplus.moviedbmvvm.R
import com.droidplusplus.moviedbmvvm.data.network.RetrofitClient
import com.droidplusplus.moviedbmvvm.data.repository.MovieRepositoryImpl
import com.droidplusplus.moviedbmvvm.ui.single_movie_details.SingleMovieActivity
import kotlinx.android.synthetic.main.activity_dashboard.*


class DashboardActivity : AppCompatActivity() {

    private lateinit var popularMoviesViewmodel: PopularMoviesViewmodel
    private val popularMovieAdapter by lazy { PopularMovieAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //Getting the instance of the viewmodel through viewodelProvider
        popularMoviesViewmodel = ViewModelProvider(
            this,
            PopularMoviesViewmodelFactory(
                MovieRepositoryImpl(RetrofitClient.getClient())
            )
        ).get(PopularMoviesViewmodel::class.java)

        //setUp recyclerViewAdapter
        rv_popular_movies.adapter = popularMovieAdapter

        //api call for load data
        popularMoviesViewmodel.getMovies()

        //observe Live Data
        popularMoviesViewmodel.mLivedata.observe(this, Observer {
            //Not null check
            it?.let {
                popularMovieAdapter.swapData(it)
            }

        })

        //adapterListItem Click Listener with one parameter lambda to navigate to the details screens
        popularMovieAdapter.clickListener = this::navigateToDetailsScreen
    }

    //Going to the the screen to show the details of the activity
    private fun navigateToDetailsScreen(itemId: Int) {
        val intent = Intent(this, SingleMovieActivity::class.java)

        intent.putExtra("ITEM_ID", itemId)
        startActivity(intent)
    }
}
