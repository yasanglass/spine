package dev.yasan.kit.core.helper

import android.app.Activity
import android.content.Context.INPUT_METHOD_SERVICE
import android.view.inputmethod.InputMethodManager

object KeyboardHelper {

    /**
     * Tries to close the keyboard if its open.
     *
     * @return If keyboard was closed.
     */
    @Deprecated(message = "Please migrate to [androidx.compose.ui.platform.LocalFocusManager] & [androidx.compose.ui.platform.LocalSoftwareKeyboardController].")
    fun closeKeyboard(activity: Activity): Boolean {
        return try {
            val inputManager = activity.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(
                activity.currentFocus!!.windowToken,
                InputMethodManager.HIDE_NOT_ALWAYS
            )
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

}