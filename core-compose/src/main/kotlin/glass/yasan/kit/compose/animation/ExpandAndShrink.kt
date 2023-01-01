package glass.yasan.kit.compose.animation

import androidx.compose.animation.*
import androidx.compose.runtime.Composable

@Composable
fun ExpandAndShrink(
    visible: Boolean,
    content: @Composable AnimatedVisibilityScope.() -> Unit,
) {
    AnimatedVisibility(
        visible = visible,
        enter = expandVertically() + fadeIn(),
        exit = shrinkVertically() + fadeOut(),
        content = content,
    )
}