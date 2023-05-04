package com.example.cashreturningsystem

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cashreturningsystem.databinding.ActivityCreateReturnBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity:AppCompatActivity() {

    private lateinit var binding: ActivityCreateReturnBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_create)

        binding = ActivityCreateReturnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cancelBtn2.setOnClickListener {

            val i = Intent(this@MainActivity, viewAllReturns::class.java)
            startActivity(i)
        }

        binding.payBtn1.setOnClickListener {
            val fName = binding.fullName.text.toString()
            val email = binding.email.text.toString()
            val phone = binding.phone.text.toString()
            val cash = binding.cash.text.toString()
            val csNIC = binding.NIC.text.toString()
            val dateToCollect = binding.dateCollect.text.toString()

            database = FirebaseDatabase.getInstance().getReference("CashReturn")

            val cReturn = CashReturnModel(fName, email, phone, cash,csNIC,dateToCollect)
            database.child(fName).setValue(cReturn).addOnSuccessListener {
                binding.fullName.text?.clear()
                binding.email.text?.clear()
                binding.phone.text?.clear()
                binding.cash.text?.clear()
                binding.NIC.text?.clear()
                binding.dateCollect.text?.clear()

                Toast.makeText(this, "Successfuly Saved", Toast.LENGTH_LONG).show()

                val i = Intent(this@MainActivity, viewAllReturns::class.java)
                startActivity(i)
            }.addOnFailureListener {
                Toast.makeText(applicationContext, "Failed", Toast.LENGTH_LONG).show()
            }
        }
    }
}
