package dev.yasan.kit.compose.preview.string

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * Provides preview parameters for [String].
 */
class StringPreviewProvider : PreviewParameterProvider<String> {

    override val values = sequenceOf(
        "Cum assimilatio experimentum, omnes sagaes imperium secundus, nobilis galluses.",
        "Nutrix de lotus solitudo, prensionem barcas!",
        "Ecce, messor!",
        "Rusticus, albus extums patienter examinare de ferox, grandis vigil.",
        "Peregrinatione tandem ducunt ad azureus animalis.",
        "Lamia, fermium, et abaculus.",
        "Ecce, noster luna!",
        "Neuter imber diligenter attrahendams homo est.",
        "Nunquam contactus devirginato.",
        "Turpiss congregabo!"
    )

}