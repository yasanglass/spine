package dev.yasan.kit.compose.preview.string

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for [String]. Only provides [String]s with at least 9 words.
 */
class StringPreviewProvider9WordsMinNullable : PreviewParameterProvider<String?> {

    override val values = sequenceOf(
        null,
        "Meet without galaxy, and we won’t feed a creature.",
        "Where is the huge sun? The hur'q is virtually fantastic. Proud nanomachines, to the center.",
        "Parasite of a calm peace, teleport the pressure! Modification, vision, and powerdrain. Machines meet with future at the carnivorous saucer section!",
    )

}