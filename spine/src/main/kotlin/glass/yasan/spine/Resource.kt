package glass.yasan.spine

import androidx.annotation.StringRes

/**
 * Used for handling data states.
 *
 * @param data The data you want to load/use.
 * @param messageResourceId The String resource id of the (error) message you want to show to the user.
 *
 * @see Resource.Initial
 * @see Resource.Loading
 * @see Resource.Success
 * @see Resource.Error
 */
public sealed class Resource<T>(
    public val data: T? = null,
    @StringRes public val messageResourceId: Int? = null
) {
    /**
     * Indicates data load success. You can use the [data] variable as it should never be null in this state.
     */
    public class Success<T>(data: T) : Resource<T>(data, null)

    /**
     * Indicates data load failure. You should provide a [messageResourceId] for the user to see.
     */
    public class Error<T>(messageResourceId: Int?) : Resource<T>(null, messageResourceId)

    /**
     * Indicates that the data is being loaded.
     */
    public class Loading<T> : Resource<T>()

    /**
     * Should be used as the default value of [Resource] variables. Can be used for initiating data load.
     */
    public class Initial<T> : Resource<T>()
}
