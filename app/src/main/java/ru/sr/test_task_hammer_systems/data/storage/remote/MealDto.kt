package ru.sr.test_task_hammer_systems.data.storage.remote

import com.google.gson.annotations.SerializedName

class MealDto(
    val idMeal: String,
    @SerializedName("strMeal")
    val name: String,
    @SerializedName("strMealThumb")
    val image: String
)