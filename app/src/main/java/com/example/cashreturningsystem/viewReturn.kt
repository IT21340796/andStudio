package com.example.cashreturningsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.example.cashreturningsystem.databinding.ActivityCreateReturnBinding
import com.example.cashreturningsystem.databinding.ActivityViewReturnBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class viewReturn : AppCompatActivity() {
   /* private lateinit var csNIC: TextView
    private lateinit var fullName: TextView
    private lateinit var email: TextView
    private lateinit var phone: TextView
    private lateinit var cashAmount: TextView
    private lateinit var dateToCollect: TextView*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_return)
    }
   /* private fun initView(){

    }
    private fun setValuesToViews(){
        csNIC.text = intent.getStringExtra("csNIC")
        fullName.text = intent.getStringExtra("fullName")
        email.text = intent.getStringExtra("email")
        phone.text = intent.getStringExtra("phone")
        cashAmount.text = intent.getStringExtra("cashAmount")
        dateToCollect.text  = intent.getStringExtra("dateToCollect")


    }*/

}