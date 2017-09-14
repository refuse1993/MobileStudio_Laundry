package com.example.kim.mobilestudio_laundry

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_orderedlist.setOnClickListener{
            val intent = Intent(this,OrderedActivity::class.java)
            startActivity(intent)
        }

        bt_acceptedlist.setOnClickListener{
            val intent = Intent(this,AcceptedList::class.java)
            startActivity(intent)
        }
        bt_management.setOnClickListener{
            val intent = Intent(this,managementActivity::class.java)
            startActivity(intent)
        }
    }
}
