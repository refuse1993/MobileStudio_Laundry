package com.example.kim.mobilestudio_laundry

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_modify.*

class ModifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify)

        bt_confirm.setOnClickListener{
            this.finish()
        }
    }
}
