package glass.yasan.spine.preference

import com.patrykandpatrick.opto.domain.Preference

suspend fun Preference<Boolean>.toggle() {
    transform { currentValue -> !currentValue }
}
