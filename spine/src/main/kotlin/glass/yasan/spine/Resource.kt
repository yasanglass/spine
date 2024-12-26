package glass.yasan.spine

public sealed interface Resource<T> {
    public class Success<T>(public val data: T) : Resource<T>
    public class Error<T>(public val code: Int? = null) : Resource<T>
    public class Loading<T> : Resource<T>
    public class Initial<T> : Resource<T>
}
