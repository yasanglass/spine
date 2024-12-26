package glass.yasan.spine.compose.type.font

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import glass.yasan.spine.compose.R

public val rubikFamily: FontFamily = FontFamily(
    Font(R.font.rubik_black, FontWeight.Black, FontStyle.Normal),
    Font(R.font.rubik_blackitalic, FontWeight.Black, FontStyle.Italic),

    Font(R.font.rubik_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.rubik_bolditalic, FontWeight.Bold, FontStyle.Italic),

    Font(R.font.rubik_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.rubik_lightitalic, FontWeight.Light, FontStyle.Italic),

    Font(R.font.rubik_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.rubik_mediumitalic, FontWeight.Medium, FontStyle.Italic),

    Font(R.font.rubik_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.rubik_italic, FontWeight.Normal, FontStyle.Italic),
)

public val rubikMonoFamily: FontFamily = FontFamily(
    Font(R.font.rubik_mono)
)