package dev.yasan.kit.compose.preview.string

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for [String]. Only provides [String]s with 3 words max.
 */
class StringPreviewProvider3WordsMax : PreviewParameterProvider<String> {

    override val values = sequenceOf(
        "The therapist yearns.",
        "Nunquam experientia olla.",
        "Devatios credere!"
    )

}