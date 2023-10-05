package glass.yasan.spine.compose.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance

@Composable
fun adaptiveContentColor(
    backgroundColor: Color,
): Color =
    if (backgroundColor.luminance() > 0.5) Color.Black else Color.White