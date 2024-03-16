package glass.yasan.spine.preference

import com.patrykandpatrick.opto.domain.Preference
import kotlinx.coroutines.flow.first

suspend inline fun <T> Preference<T>.transform(
    transformation: (currentValue: T) -> T
) {
    set(transformation(get().first()))
}
