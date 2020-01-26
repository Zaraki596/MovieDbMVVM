package com.droidplusplus.moviedbmvvm.ui.popular_movie

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.droidplusplus.moviedbmvvm.R
import com.droidplusplus.moviedbmvvm.data.model.Movie
import com.droidplusplus.moviedbmvvm.data.network.TMDB_IMAGEURL
import kotlinx.android.synthetic.main.item_movie.view.*

class PopularMovieAdapter :
    ListAdapter<Movie, PopularMovieAdapter.PopularMovieViewHolder>(
        MovieDC()
    ) {

    //Click listener lambda taking itemId variable returning Unit type
    var clickListener: (itemId: Int) -> Unit = { }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PopularMovieViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
    )

    override fun onBindViewHolder(holder: PopularMovieViewHolder, position: Int) =
        holder.bind(getItem(position))

    fun swapData(data: List<Movie>) {
        submitList(data.toMutableList())
    }

    inner class PopularMovieViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView), OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

            if (adapterPosition == RecyclerView.NO_POSITION) return

            val item = getItem(adapterPosition)
            //null check
            item?.id?.let { clickListener.invoke(it) }


        }

        fun bind(item: Movie) = with(itemView) {

            //Setting Imageview with help of coil image Library
            val imageUrl = TMDB_IMAGEURL + item.posterPath
            this.iv_poster.load(imageUrl) {
                crossfade(true)
                placeholder(R.drawable.cinema)
            }
            this.tv_title.text = item.title
            this.tv_date.text = item.release_date
            this.tv_rating.text = item.vote_average.toString()
        }
    }


    // DiffUtil callBack method to check the data are same

    private class MovieDC : DiffUtil.ItemCallback<Movie>() {
        override fun areItemsTheSame(
            oldItem: Movie,
            newItem: Movie
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Movie,
            newItem: Movie
        ): Boolean {
            return oldItem.title == oldItem.title
        }
    }
}
