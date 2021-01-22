package dka.project.ikomers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dka.project.ikomers.databinding.UiLayoutSplashscreenBinding

class ActivitySplashScreen : AppCompatActivity() {

    private lateinit var mBinding: UiLayoutSplashscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.ui_layout_splashscreen)
    }
}