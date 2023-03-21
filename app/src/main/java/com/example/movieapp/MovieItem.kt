package com.example.movieapp

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("Search")
    val search: ArrayList<MovieItem>,
    val totalResults: String,
    @SerializedName("Response")
    val response: String,
)

data class MovieItem(
    @SerializedName("Title")
    val title: String,
    @SerializedName("Year")
    val year: String,
    @SerializedName("imdbID")
    val imdbId: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Poster")
    val poster: String,
)