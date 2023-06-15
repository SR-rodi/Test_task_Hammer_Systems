package ru.sr.test_task_hammer_systems.data.wrapper

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface DispatcherWrapper {
    val io: CoroutineDispatcher
}

class DispatcherWrapperImpl() : DispatcherWrapper {
    override val io: CoroutineDispatcher = Dispatchers.IO
}