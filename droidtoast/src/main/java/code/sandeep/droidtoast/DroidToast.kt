package code.sandeep.droidtoast

import android.content.Context
import android.widget.Toast

object DroidToast {

    fun showToast(context: Context, message: String, duration: Int = Toast.LENGTH_LONG) {
        Toast.makeText(context, message, duration).show()
    }
}