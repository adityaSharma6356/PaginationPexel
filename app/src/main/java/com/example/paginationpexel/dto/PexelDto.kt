package com.example.paginationpexel.dto

data class PexelDto(
    val next_page: String,
    val page: Int,
    val per_page: Int,
    val photos: List<Photo>,
    val prev_page: String,
    val total_results: Int
)

