package glass.yasan.spine.extension

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

public fun <T> Flow<T>.firstBlocking(): T = runBlocking { first() }
