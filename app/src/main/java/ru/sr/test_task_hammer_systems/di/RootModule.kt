package ru.sr.test_task_hammer_systems.di

import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import ru.sr.test_task_hammer_systems.data.storage.local.FoodDataBase
import ru.sr.test_task_hammer_systems.data.storage.remote.Api
import ru.sr.test_task_hammer_systems.data.wrapper.DispatcherWrapper
import ru.sr.test_task_hammer_systems.data.wrapper.DispatcherWrapperImpl

fun rootModule() = listOf(networkModule(), localModule(), wrapperModule())

const val BASE_URL = "www.themealdb.com/api/json/"

private fun networkModule() = module {
    single {
        Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single<Api> { get<Retrofit>().create() }
}

private fun localModule() = module {
    single { FoodDataBase.getInstance(get()) }

    single { get<FoodDataBase>().createFoodDao() }
}

private fun wrapperModule() = module {
    singleOf(::DispatcherWrapperImpl){bind<DispatcherWrapper>()}
}