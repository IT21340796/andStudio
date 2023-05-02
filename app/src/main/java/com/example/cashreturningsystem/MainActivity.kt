package com.example.cashreturningsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.cashreturningsystem.databinding.ActivityCreateBinding
import com.example.cashreturningsystem.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.sql.DatabaseMetaData

class MainActivity:AppCompatActivity() {

private lateinit var btnCreateData: Button
private lateinit var btnFetchData: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        btnFetchData = findViewById(R.id.cancelBtn2)


        btnFetchData.setOnClickListener {

        }
    }
}