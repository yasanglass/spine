package dev.yasan.kit.compose.preview.bool

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for nullable [Boolean].
 */
class BooleanPreviewProvider : PreviewParameterProvider<Boolean> {

    override val values = sequenceOf(false, true)

}