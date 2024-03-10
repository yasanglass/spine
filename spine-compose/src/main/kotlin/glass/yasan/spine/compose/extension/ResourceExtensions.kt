package glass.yasan.spine.compose.extension

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import glass.yasan.spine.Resource
import glass.yasan.spine.compose.extension.ResourceVisualizer.ERROR_KEY
import glass.yasan.spine.compose.extension.ResourceVisualizer.LOADING_KEY

@Composable
public fun <T> Resource<T>.Visualize(
    successContent: @Composable (T) -> Unit,
    errorContent: @Composable () -> Unit,
    loadingContent: @Composable () -> Unit,
) {
    when (this) {
        is Resource.Success -> {
            val resourceData = data
            if (resourceData != null) {
                successContent(resourceData)
            } else {
                errorContent()
            }
        }

        is Resource.Initial,
        is Resource.Loading -> {
            loadingContent()
        }

        is Resource.Error -> {
            errorContent()
        }
    }
}

public fun <T> LazyListScope.visualizeResource(
    resource: Resource<T>,
    successContent: LazyListScope.(T) -> Unit,
    errorContent: @Composable (LazyItemScope.(messageResourceId: Int?) -> Unit),
    loadingContent: @Composable (LazyItemScope.() -> Unit),
) {
    when (resource) {
        is Resource.Success -> {
            val resourceData = resource.data
            if (resourceData != null) {
                successContent(resourceData)
            } else {
                item(key = ERROR_KEY) { errorContent(resource.messageResourceId) }
            }
        }

        is Resource.Initial,
        is Resource.Loading -> {
            item(key = LOADING_KEY) { loadingContent() }
        }

        is Resource.Error -> {
            item(key = ERROR_KEY) { errorContent(resource.messageResourceId) }
        }
    }
}

private object ResourceVisualizer {
    const val ERROR_KEY = "error"
    const val LOADING_KEY = "loading"
}
