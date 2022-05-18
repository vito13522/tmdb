package com.mindorks.framework.db

data class GetMoviesResponse(
    val page: Int,
    val movies: List<Movie>,
    val pages: Int
)
