package code.sandeep.droidtoast

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * @author Sandeep Karanam
 * @date 30 Aug 2023
 * This class is a static class which is responsible for showing the toast to the user based on the
 * status of the request or the message which want to showcase.
 *
 */
object DroidToast {

    /**
     * These constants SUCCESS, FAILURE, and WARNING are used to set the color of the text based
     * on the status of the message want to showcase to the users
     */
    const val SUCCESS = "success"
    const val FAILURE = "failure"
    const val WARNING = "warning"

    /**
     * This function is invoked by using ClassName itself.
     * @param context The context can be activity or the application
     * @param message The message which want to showcase on the toast
     * @param duration The duration of the toast by default its Toast.LENGTH_LONG
     * @param status The status of the toast which want to showcase to the users by default its success.
     */
    fun showToast(
        context: Context,
        message: String,
        duration: Int? = Toast.LENGTH_LONG,
        status: String? = SUCCESS
    ) {
        // Get the root view for the activity or fragment to access the element in the toast customized view
        val view = LayoutInflater.from(context).inflate(
            R.layout.alert, (context as Activity).window.decorView.rootView as ViewGroup, false
        )
        // Get the toast object
        val toast = Toast.makeText(context, "", duration ?: Toast.LENGTH_LONG)
        (view.findViewById(R.id.tv_message) as TextView).text = message
        toast?.also {
            when (status) {
                SUCCESS -> {
                    (view.findViewById(R.id.iv_message) as ImageView).setImageResource(R.drawable.icon_success)
                    (view.findViewById(R.id.tv_message) as TextView).setTextColor(
                        (context).resources.getColor(
                            R.color.success_color, null
                        )
                    )
                }
                FAILURE -> {
                    (view.findViewById(R.id.iv_message) as ImageView).setImageResource(R.drawable.icon_failure)
                    (view.findViewById(R.id.tv_message) as TextView).setTextColor(
                        (context).resources.getColor(
                            R.color.failure_color, null
                        )
                    )
                }
                WARNING -> {
                    (view.findViewById(R.id.iv_message) as ImageView).setImageResource(R.drawable.icon_warning)
                    (view.findViewById(R.id.tv_message) as TextView).setTextColor(
                        (context).resources.getColor(
                            R.color.warning_color, null
                        )
                    )
                }

            }
            it.view = view
            it.show()
        }
    }
}