package com.WooRomero.ut_map.model

data class Location(
    val name: String,
    val lat: Double,
    val long: Double,
    val tags: List<String>,
    val snippet: String = "",
    var visibility: Boolean = true

)
