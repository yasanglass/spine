package glass.yasan.spine.compose.foundation

import androidx.compose.runtime.Stable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public val gridUnit: Dp = 8.dp

@Stable
public inline val Int.grid: Dp get() = gridUnit * this

@Stable
public inline val Float.grid: Dp get() = gridUnit * this
