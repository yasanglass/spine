package glass.yasan.spine.compose.foundation

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val gridUnit = 8.dp

@Stable
inline val Int.grid: Dp get() = gridUnit * this

@Stable
inline val Float.grid: Dp get() = gridUnit * this
