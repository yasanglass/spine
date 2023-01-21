package glass.yasan.spine.compose.components

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
import glass.yasan.spine.compose.R
import glass.yasan.spine.compose.foundation.grid

/**
 * YASAN branding footer composable. Shows YASAN logo in form of a footer.
 */
@Composable
fun YasanBrandingFooter(
    modifier: Modifier = Modifier,
    spacerTop: Dp = grid(8),
    spacerBottom: Dp = grid(8),
    logoHeight: Dp = grid(6),
    crossFade: Boolean = true,
    invertedColors: Boolean = false,
) {

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (spacerTop > 0.dp) {
            Spacer(Modifier.requiredHeight(spacerTop))
        }
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(
                    if (invertedColors) R.drawable.ic_yasan_logo_text2_color_inverted
                    else R.drawable.ic_yasan_logo_text2_color
                )
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