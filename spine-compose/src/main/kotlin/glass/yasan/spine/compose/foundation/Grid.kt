package glass.yasan.spine.compose.foundation

import androidx.annotation.IntRange
import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val gridUnit = 8.dp

@Stable
inline val Int.grid: Dp get() = gridUnit * this

@Stable
inline val Float.grid: Dp get() = gridUnit * this

@Deprecated(
    "Migrate to the new Float.grid extension function",
    replaceWith = ReplaceWith("multiplier.grid"),
    level = DeprecationLevel.ERROR,
)
@Stable
fun grid(multiplier: Float) = gridUnit * multiplier

@Deprecated(
    "Migrate to the new Int.grid extension function",
    replaceWith = ReplaceWith("multiplier.grid"),
    level = DeprecationLevel.ERROR,
)
@Stable
fun grid(@IntRange(from = 2) multiplier: Int) = gridUnit * multiplier

@Deprecated(
    "Migrate to the new Int.grid extension function",
    replaceWith = ReplaceWith("1.grid"),
    level = DeprecationLevel.ERROR,
)
@Stable
fun grid() = gridUnit
