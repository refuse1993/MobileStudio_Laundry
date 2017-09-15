package com.example.kim.mobilestudio_laundry

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_ordered.*

class OrderedActivity : AppCompatActivity() {
    private var datas = ArrayList<Ordered>()
    lateinit var adapter : OrderedListAdt
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordered)

        var dbRef = FirebaseDatabase.getInstance().getReference("laundry/orders")
        dbRef.addListenerForSingleValueEvent(postListener)

        adapter = OrderedListAdt(datas, this)
        lv_ordered.setAdapter(adapter)
    }
    private val postListener = object : ValueEventListener {
        override fun onDataChange(datasnapshot: DataSnapshot) {
            datas.clear()
            for(snapshot in datasnapshot.getChildren()) {
                var ordered = snapshot.getValue(Ordered::class.java)
                datas.add(ordered!!)
            }
            adapter.notifyDataSetChanged()
        }

        override fun onCancelled(p0: DatabaseError?) {

        }
    }
}
