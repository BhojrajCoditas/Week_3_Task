package com.example.week3task

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val shortDescription: String,
    val fullDescription: String,
    @DrawableRes val imageResId: Int
) : Parcelable
