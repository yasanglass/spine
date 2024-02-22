package glass.yasan.spine.compose.extension

import androidx.compose.runtime.Composable
import glass.yasan.spine.Resource

@Composable
public fun <T> Resource<T>.Content(
    success: @Composable (T) -> Unit,
    error: @Composable () -> Unit,
    loading: @Composable () -> Unit,
) {
    when (this) {
        is Resource.Success -> {
            val resourceData = data
            if (resourceData != null) {
                success(resourceData)
            } else {
                error()
            }
        }

        is Resource.Initial,
        is Resource.Loading -> {
            loading()
        }

        is Resource.Error -> {
            error()
        }
    }
}
