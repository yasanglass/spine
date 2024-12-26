package glass.yasan.spine.extension

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

fun <T> Flow<T>.firstBlocking() = runBlocking { first() }
