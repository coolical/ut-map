package com.example.ut_map.model

data class Location(
    val name: String,
    val lat: Double,
    val long: Double,
    val tags: List<String>,
    var visibility: Boolean = true
)
