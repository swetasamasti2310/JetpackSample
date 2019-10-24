package com.example.jetpacksample.architecture.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.jetpacksample.R
import com.example.jetpacksample.architecture.databinding.AddEmployeeActivity
import com.example.jetpacksample.databinding.FragmentAddedEmployeeBinding

class AddedEmployeeFragment: Fragment()
{
    lateinit var binding: FragmentAddedEmployeeBinding
    @Override
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_added_employee, container, false)

        if (activity is AddEmployeeActivity) {
            binding.addedEmployee = (activity as AddEmployeeActivity).binding.employee
        }

        return binding.root
    }
}

