package com.example.cashreturningsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ActivityViewReturn : AppCompatActivity() {

    private lateinit var btnUpdate : Button
    private lateinit var  btnDelete :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_return)

        btnUpdate.setOnClickListener {
            openUpdateDialog(
                intent.getStringExtra("csNIC").toString() ,
                intent.getStringExtra("fullName").toString(),
                intent.getStringExtra("email").toString(),
                intent.getStringExtra("phone").toString(),
                intent.getStringExtra("cashAmount").toString(),
                intent.getStringExtra("dateToCollect").toString()


            )
        }


        val cReturn = intent.getParcelableExtra<CashReturnModel>("csNIC")
        if(cReturn!=null){
          val nIC :TextView = findViewById(R.id.csNIC)
            val name :TextView = findViewById(R.id.fullName)
            val phone :TextView = findViewById(R.id.phone)
            val email :TextView = findViewById(R.id.email)
            val cash :TextView = findViewById(R.id.cashAmount)
            val dateCollect :TextView = findViewById(R.id.dateToCollect)


            Toast.makeText(this,"NIC,${cReturn.fullName}",Toast.LENGTH_SHORT).show()

            nIC.text = cReturn.csNIC
            name.text = cReturn.fullName
            email.text = cReturn.email
            phone.text = cReturn.phone
            cash.text = cReturn.cashAmount
            dateCollect.text = cReturn.dateToCollect

        }

    }
    private fun openUpdateDialog(
        csNIC:String,
        fullName :String,
        email :String,
        phone: String,
        cashAmount :String,
        dateCollect: String
    ){
        val mDialog = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val mDialogView = inflater.inflate(R.layout.upda)

    }

}