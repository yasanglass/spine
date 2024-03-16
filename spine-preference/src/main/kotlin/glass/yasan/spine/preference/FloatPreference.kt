package glass.yasan.spine.preference

import com.patrykandpatrick.opto.domain.Preference

suspend fun Preference<Float>.add(value: Float) {
    transform { currentValue -> currentValue + value }
}

suspend fun Preference<Float>.increment() {
    add(1F)
}

suspend fun Preference<Float>.subtract(amount: Float) {
    transform { currentValue -> currentValue - amount }
}

suspend fun Preference<Float>.decrement() {
    subtract(1F)
}

suspend fun Preference<Float>.multiply(amount: Float) {
    transform { currentValue -> currentValue * amount }
}

suspend fun Preference<Float>.divide(amount: Float) {
    transform { currentValue -> currentValue / amount }
}
