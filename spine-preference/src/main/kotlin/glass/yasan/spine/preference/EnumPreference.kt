package glass.yasan.spine.preference

import androidx.datastore.preferences.core.stringPreferencesKey
import com.patrykandpatrick.opto.core.PreferenceImpl
import com.patrykandpatrick.opto.core.PreferenceManager

private inline fun <reified E : Enum<E>> PreferenceManager.enumPreference(
    key: String,
    defaultValue: E,
): PreferenceImpl<String, E> = preference(
    stringPreferencesKey(key),
    defaultValue = defaultValue,
    serialize = { it.toString() },
    deserialize = { E::class.java.getMethod("valueOf", String::class.java).invoke(null, it) as E },
)
