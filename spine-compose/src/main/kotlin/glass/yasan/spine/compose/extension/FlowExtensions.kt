package glass.yasan.spine.compose.extension

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import glass.yasan.spine.extension.firstBlocking
import kotlinx.coroutines.flow.Flow

@Composable
fun <T> Flow<T>.collectAsStateBlocking() = collectAsState(initial = firstBlocking())
