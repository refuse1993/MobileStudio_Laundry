package com.example.kim.mobilestudio_laundry

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_management.*

class managementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_management)

        supportActionBar?.run {
            setTitle("가게관리")
        }
        bt_modify.setOnClickListener {
            val intent = Intent(this, ModifyActivity::class.java)
            startActivity(intent)
        }
    }
}
