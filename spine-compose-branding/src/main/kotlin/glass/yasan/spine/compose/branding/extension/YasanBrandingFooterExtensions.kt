package glass.yasan.spine.compose.branding.extension

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import glass.yasan.spine.compose.branding.YasanBrandingFooter
import glass.yasan.spine.compose.branding.YasanColors
import glass.yasan.spine.compose.foundation.grid

public fun LazyListScope.yasanBrandingFooter(
    modifier: Modifier = Modifier,
    spacerTop: Dp = 8.grid,
    spacerBottom: Dp = 8.grid,
    logoHeight: Dp = 6.grid,
    crossFade: Boolean = true,
    colors: YasanColors = YasanColors.DarkLight,
) {
    item {
        YasanBrandingFooter(
            modifier = modifier,
            spacerTop = spacerTop,
            spacerBottom = spacerBottom,
            logoHeight = logoHeight,
            crossFade = crossFade,
            colors = colors,
        )
    }
}
 