package code.sandeep.droidtoast

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        DroidToast.showToast(this, "Simple Failure Message from sample library", status = DroidToast.FAILURE)
        DroidToast.showToast(this, "Simple Success Message from sample library", status = DroidToast.SUCCESS)
        DroidToast.showToast(this, "Simple Warning Message from sample library", status = DroidToast.WARNING)
    }
}