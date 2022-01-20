package com.zwt.dyapplaunchericon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    private var app: String = LauncherUtil.APP

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RadioGroup>(R.id.rg_app).setOnCheckedChangeListener { _, checkedId ->
            app = when (checkedId) {
                R.id.rb_app_a -> LauncherUtil.APP_A
                R.id.rb_app_b -> LauncherUtil.APP_B
                else -> LauncherUtil.APP
            }
        }
        findViewById<Button>(R.id.btn_switch_launcher).setOnClickListener {
            LauncherUtil.enableLauncher(this, app)
        }
    }
}