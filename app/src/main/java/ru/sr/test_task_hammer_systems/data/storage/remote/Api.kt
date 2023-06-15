package ru.sr.test_task_hammer_systems.data.storage.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface Api {

    @GET(FILTER)
    suspend fun getFootByFilter(): MealsDto

    private companion object {
        const val FILTER = "v1/1/filter.php?c=Seafood"
    }
}
