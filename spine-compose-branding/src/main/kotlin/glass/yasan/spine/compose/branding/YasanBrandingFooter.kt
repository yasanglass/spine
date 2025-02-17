package glass.yasan.spine.compose.branding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import glass.yasan.spine.compose.foundation.grid

@Composable
public fun YasanBrandingFooter(
    modifier: Modifier = Modifier,
    spacerTop: Dp = 8.grid,
    spacerBottom: Dp = 8.grid,
    logoHeight: Dp = 6.grid,
    crossFade: Boolean = true,
    colors: YasanColors = YasanColors.DarkLight,
) {

    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (spacerTop > 0.dp) {
            Spacer(Modifier.requiredHeight(spacerTop))
        }
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(colors.resolveImageData())
                .crossfade(crossFade)
                .build(),
            contentDescription = null,
            modifier = Modifier.requiredHeight(logoHeight)
        )
        if (spacerBottom > 0.dp) {
            Spacer(Modifier.requiredHeight(spacerBottom))
        }
    }
}

public enum class YasanColors {
    DarkLight,
    DarkLightInverted,
}

private fun YasanColors.resolveImageData(): Int =
    when (this) {
        YasanColors.DarkLight -> R.drawable.ic_yasan_logo_text2_color
        YasanColors.DarkLightInverted -> R.drawable.ic_yasan_logo_text2_color_inverted
    }