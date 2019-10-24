package com.example.jetpacksample.architecture.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.jetpacksample.R

class EmployeeManagementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_management)
    }

    fun startAddEmployeeActivity(view: View) {
        val intent = Intent(this, AddEmployeeActivity::class.java)
        startActivity(intent)
    }
    fun startDeleteEmployeeActivity(view: View) {}
    fun startShowEmployeesActivity(view: View) {}
}
