package glass.yasan.spine.compose.extension

import androidx.compose.runtime.Composable
import glass.yasan.spine.Resource

@Composable
public fun <T> Resource<T>.Content(
    contentSuccess: @Composable (T) -> Unit,
    contentError: @Composable (messageResourceId: Int?) -> Unit,
    contentLoading: @Composable () -> Unit,
) {
    when (this) {
        is Resource.Success -> {
            val resourceData = data
            if (resourceData != null) {
                contentSuccess(resourceData)
            } else {
                contentError(messageResourceId)
            }
        }

        is Resource.Initial,
        is Resource.Loading -> {
            contentLoading()
        }

        is Resource.Error -> {
            contentError(messageResourceId)
        }
    }
}
