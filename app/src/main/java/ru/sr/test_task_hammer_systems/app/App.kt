package ru.sr.test_task_hammer_systems.app

import android.app.Application
import org.koin.core.context.startKoin
import ru.sr.test_task_hammer_systems.di.rootModule

class App:Application (){
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(rootModule())
        }
    }
}