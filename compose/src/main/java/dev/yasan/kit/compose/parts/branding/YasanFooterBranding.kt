package dev.yasan.kit.compose.parts.branding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import coil.compose.rememberImagePainter
import dev.yasan.kit.compose.R
import dev.yasan.kit.compose.foundation.grid

/**
 * YASAN branding footer composable. Shows YASAN logo in form of a footer.
 */
@Composable
fun YasanBrandingFooter(
    modifier: Modifier = Modifier,
    topSpacerSize: Dp = grid(8),
    bottomSpacerSize: Dp = grid(8),
    logoHeight: Dp = grid(6),
    crossFade: Boolean = true
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.requiredHeight(topSpacerSize))
        Image(
            rememberImagePainter(
                data = R.drawable.ic_yasan_logo_text2_color,
                builder = {
                    crossfade(crossFade)
                }
            ),
            contentDescription = null,
            modifier = Modifier.requiredHeight(logoHeight)
        )
        Spacer(Modifier.requiredHeight(bottomSpacerSize))
    }


}