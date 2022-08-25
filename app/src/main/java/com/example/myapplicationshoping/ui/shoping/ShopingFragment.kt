package com.example.myapplicationshoping.ui.shoping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationshoping.databinding.FragmentShopingBinding


class ShopingFragment : Fragment() {

    private var _binding: FragmentShopingBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val shopingViewModel =
            ViewModelProvider(this).get(ShopingViewModel::class.java)

        _binding = FragmentShopingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textShoping
        shopingViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}