package dev.yasan.kit.compose.preview.string

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for nullable [String]. Only provides [String]s with 3 words max.
 */
class StringPreviewProvider3WordsMaxNullable : PreviewParameterProvider<String?> {

    override val values = sequenceOf(
        null,
        "The therapist yearns.",
        "Nunquam experientia olla.",
        "Devatios credere!"
    )

}