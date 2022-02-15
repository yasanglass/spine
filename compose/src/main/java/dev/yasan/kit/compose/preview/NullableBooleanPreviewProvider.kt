package dev.yasan.kit.compose.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for [Boolean]?.
 */
class NullableBooleanPreviewProvider : PreviewParameterProvider<Boolean?> {

    override val values = sequenceOf(null, false, true)

}