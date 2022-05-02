package com.woo_romero.ut_map.model

import androidx.annotation.DrawableRes

data class Category(
    @DrawableRes
    val imageResourceID: Int,
    val name: String,
    val list: List<Location>,
    var toggle: Boolean = true
)
