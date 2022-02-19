package dev.yasan.kit.compose.preview.bool

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for [Boolean]?.
 */
class BooleanNullablePreviewProvider : PreviewParameterProvider<Boolean?> {

    override val values = sequenceOf(null, false, true)

}