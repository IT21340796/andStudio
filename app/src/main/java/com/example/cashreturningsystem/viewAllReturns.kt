package com.example.cashreturningsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import java.text.FieldPosition

class viewAllReturns : AppCompatActivity() {

    private lateinit var  dhref : DatabaseReference
    private lateinit var returnRecyclerView: RecyclerView
    private lateinit var returnArrayList: ArrayList<CashReturnModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all_returns)

        returnRecyclerView = findViewById(R.id.viewAll)//recycler view List
        returnRecyclerView.layoutManager = LinearLayoutManager(this)
        returnRecyclerView.setHasFixedSize(true)

        returnArrayList = arrayListOf<CashReturnModel>()
        getReturnData()

    }
    private fun getReturnData()
    {
        dhref = FirebaseDatabase.getInstance().getReference("CashReturn")

        dhref.addValueEventListener(object:ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    for (userSnapshot in snapshot.children) {

                        val ret = userSnapshot.getValue(CashReturnModel::class.java)
                        returnArrayList.add(ret!!)

                    }
                    returnRecyclerView.adapter = MyAdaptor(returnArrayList)
                }
            }
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }
}