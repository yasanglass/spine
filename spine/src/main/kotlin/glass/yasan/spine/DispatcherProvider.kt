package glass.yasan.spine

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * An interface meant for providing Coroutines' [Dispatchers] as singletons using dependency injection.
 *
 * @see Dispatchers
 * @see CoroutineDispatcher
 */
public interface DispatcherProvider {
    public val main: CoroutineDispatcher
    public val io: CoroutineDispatcher
    public val default: CoroutineDispatcher
    public val unconfined: CoroutineDispatcher
}
