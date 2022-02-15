package dev.yasan.kit.core.ui.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for [Boolean].
 */
class BooleanPreviewProvider : PreviewParameterProvider<Boolean> {

    override val values = sequenceOf(false, true)

}