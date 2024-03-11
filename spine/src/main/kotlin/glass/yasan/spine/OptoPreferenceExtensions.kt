package glass.yasan.spine

import com.patrykandpatrick.opto.domain.Preference
import kotlinx.coroutines.flow.first

// region Int

suspend fun Preference<Int>.transform(
    transformation: (currentValue: Int) -> Int
) {
    set(transformation(get().first()))
}

suspend fun Preference<Int>.add(value: Int) {
    transform { currentValue -> currentValue + value }
}

suspend fun Preference<Int>.increment() {
    add(1)
}

suspend fun Preference<Int>.subtract(amount: Int) {
    transform { currentValue -> currentValue - amount }
}

suspend fun Preference<Int>.decrement() {
    subtract(1)
}

suspend fun Preference<Int>.multiply(amount: Int) {
    transform { currentValue -> currentValue * amount }
}

suspend fun Preference<Int>.divide(amount: Int) {
    transform { currentValue -> currentValue / amount }
}

// endregion Int
