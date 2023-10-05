package glass.yasan.spine

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent
import glass.yasan.spine.WebHelper.PLAY_STORE_APP_LINK_PREFIX
import glass.yasan.spine.WebHelper.openWebView
import java.util.regex.Pattern

/**
 * A helper class with a set of functions that help with web related difficulties in Android applications.
 */
object WebHelper {

    /**
     * The prefix of every app's Google Play Store's page. Just add your app's packageName to it end of it.
     */
    private const val PLAY_STORE_APP_LINK_PREFIX = "https://play.google.com/store/apps/details?id="
    private const val APP_REF_PREFIX = "android-app://"
    private const val URL_REGEX =
        "^((https?|ftp)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?].*)?$"


    /**
     * Opens the URL in a web view. It also sets the app's package name as the referrer.
     *
     * @return If [url] was launched successfully.
     */
    fun openWebView(context: Context, url: String): Boolean {
        try {
            val builder: CustomTabsIntent.Builder = CustomTabsIntent.Builder()
            val intent: CustomTabsIntent = builder.build()
            intent.intent.putExtra(
                Intent.EXTRA_REFERRER,
                Uri.parse(APP_REF_PREFIX + context.packageName)
            )
            intent.intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            intent.launchUrl(context, Uri.parse(url))
            return true
        } catch (e: Exception) {
            return try {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(browserIntent)
                true
            } catch (e: Exception) {
                false
            }
        }
    }

    /**
     * Opens an app's Google Play Store page. It also sets the app's package name as the referrer.
     *
     * @param packageName The package name of the app you want to open in Play Store.
     * If null, it will open the current app's Play Store page.
     *
     * @see openWebView
     * @see PLAY_STORE_APP_LINK_PREFIX
     */
    fun openAppOnPlayStore(context: Context, packageName: String? = null) =
        openWebView(
            context,
            PLAY_STORE_APP_LINK_PREFIX + (packageName ?: context.packageName)
        )

    /**
     * Checks if the string is a valid URL or not.
     */
    fun isStringURL(string: String): Boolean {
        val pattern = Pattern.compile(URL_REGEX)
        val matcher = pattern.matcher(string)
        return matcher.find()
    }

}