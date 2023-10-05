package glass.yasan.spine

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * An interface meant for providing Coroutines' [Dispatchers] as singletons using dependency injection.
 *
 * @see Dispatchers
 * @see CoroutineDispatcher
 */
interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}
