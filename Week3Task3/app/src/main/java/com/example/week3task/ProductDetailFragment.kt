package com.example.week3task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.navigation.fragment.findNavController

class ProductDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_detail, container, false)

        val product = ProductDetailFragmentArgs.fromBundle(requireArguments()).product

        view.findViewById<TextView>(R.id.detailName).text = product.name
        view.findViewById<TextView>(R.id.detailPrice).text = "$${product.price}"
        view.findViewById<TextView>(R.id.detailDescription).text = product.fullDescription
        view.findViewById<ImageView>(R.id.detailImage).setImageResource(product.imageResId)

        // Back Button Click Listener
        view.findViewById<ImageView>(R.id.backButton).setOnClickListener {
            findNavController().navigateUp()
        }

        return view
    }
}

