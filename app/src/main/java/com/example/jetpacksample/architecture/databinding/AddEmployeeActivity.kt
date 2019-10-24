package com.example.jetpacksample.architecture.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpacksample.R
import com.example.jetpacksample.architecture.databinding.model.Employee
import com.example.jetpacksample.databinding.ActivityAddEmployeeBinding
import kotlinx.android.synthetic.main.activity_add_employee.*

class AddEmployeeActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddEmployeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_employee)

        addBtn.setOnClickListener {
            val name : String = emplyeeNameEditTxt.text.toString()
            val dept : String = emplyeeDeptEditTxt.text.toString()
            binding.employee = Employee(name, dept)
            showAddedEmpDetails()
        }
    }

    private fun showAddedEmpDetails() {
        supportFragmentManager.beginTransaction().add(R.id.fragmentEmployeeAdded,
            AddedEmployeeFragment()
        ).commit()
    }
}
