package com.mindorks.framework.db


data class Movie(
   val id: Long,
   val title: String,
   val overview: String,
   val posterPath: String,
   val backdropPath: String,
   val rating: Float,
   val releaseDate: String
)
