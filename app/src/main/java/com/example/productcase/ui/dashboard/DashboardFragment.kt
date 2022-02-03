package com.example.productcase.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.productcase.R
import com.example.productcase.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_dashboard, container, false)
        buttonController()
        return binding.root
    }

    private fun buttonController() {
        binding.buttonProductDetail.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboardFragment_to_productDetailFragment)
        }
    }


}