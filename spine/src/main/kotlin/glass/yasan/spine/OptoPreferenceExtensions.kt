package glass.yasan.spine

import androidx.datastore.preferences.core.stringPreferencesKey
import com.patrykandpatrick.opto.core.PreferenceImpl
import com.patrykandpatrick.opto.core.PreferenceManager
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

// region Enum

private inline fun <reified E : Enum<E>> PreferenceManager.enumPreference(
    key: String,
    defaultValue: E,
): PreferenceImpl<String, E> = preference(
    stringPreferencesKey(key),
    defaultValue = defaultValue,
    serialize = { it.toString() },
    deserialize = { E::class.java.getMethod("valueOf", String::class.java).invoke(null, it) as E },
)

// endregion Enum
