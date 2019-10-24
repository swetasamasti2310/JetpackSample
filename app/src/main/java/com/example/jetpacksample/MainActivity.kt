package com.example.jetpacksample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.jetpacksample.architecture.databinding.EmployeeManagementActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startDataBindingActivity(view: View) {
        val intent = Intent(this, EmployeeManagementActivity::class.java)
        startActivity(intent)
    }
}
