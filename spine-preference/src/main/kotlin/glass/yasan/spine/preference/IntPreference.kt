package glass.yasan.spine.preference

import com.patrykandpatrick.opto.domain.Preference

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
