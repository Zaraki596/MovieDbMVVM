package com.droidplusplus.moviedbmvvm.ui.single_movie_details

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.api.load
import com.droidplusplus.moviedbmvvm.R
import com.droidplusplus.moviedbmvvm.data.network.TMDB_IMAGEURL
import java.text.NumberFormat
import java.util.*

@BindingAdapter("formatTime")
fun formatTime(view: View, value: Int?) {
    value?.let {
        if (view is TextView) {
            view.text = "$it minutes"
        }


    }
}

@BindingAdapter("formatAmount")
fun formatAmount(view: View, value: Long?) {
    //Logic to convert the amount into the actual amount
    value?.let {
        val formatCurrency = NumberFormat.getCurrencyInstance(Locale.US)
        if (view is TextView) {
            view.text = formatCurrency.format(it)
        }
    }
}

@BindingAdapter("loadImage")
fun loadImage(view: ImageView, url: String?) {
    url?.let {
        view.load(TMDB_IMAGEURL + url) {
            crossfade(true)
            placeholder(R.drawable.cinema)
        }
    }


}