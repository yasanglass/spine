package glass.yasan.spine.compose.foundation

import androidx.annotation.IntRange
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.dp

private val grid = 8.dp

@Stable
fun grid(multiplier: Float) = grid * multiplier

@Stable
fun grid(@IntRange(from = 2) multiplier: Int) = grid * multiplier

@Stable
fun grid() = grid