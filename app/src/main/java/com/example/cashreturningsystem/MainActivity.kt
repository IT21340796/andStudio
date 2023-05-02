package com.example.cashreturningsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.cashreturningsystem.databinding.ActivityCreateBinding
import com.example.cashreturningsystem.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.sql.DatabaseMetaData

class MainActivity:AppCompatActivity() {

private lateinit var binding: ActivityCreateBinding
private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createBtn2.setOnClickListener{
            val fullName = binding.fullName.text.toString()
            val email = binding.email.text.toString()
            val phone = binding.phone.text.toString()

            database = FirebaseDatabase.getInstance().getReference("CashReturn")

        }


    }
}