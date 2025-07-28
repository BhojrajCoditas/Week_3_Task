package com.example.week3task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

class ProductListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_list, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        val productList = listOf(
            Product(
                1,
                "Product 1",
                19.99,
                "This is a short description of product 1",
                "Detailed detailed description of product 1. It provides more information about the features and benefits of the product.",
                R.drawable.product1
            ),
            Product(
                2,
                "Product 2",
                29.99,
                "This is a short description of product 2",
                "Detailed detailed description of product 2. It provides more information about the features and benefits of the product.",
                R.drawable.product2
            ),
            Product(
                3,
                "Product 3",
                14.99,
                "This is a short description of product 3",
                "Detailed detailed description of product 3. It provides more information about the features and benefits of the product.",
                R.drawable.product3
            ),
            Product(
                4,
                "Product 4",
                38.99,
                "This is a short description of product 4",
                "Detailed detailed description of product 4. It provides more information about the features and benefits of the product.",
                R.drawable.product4
            ),
            Product(
                5,
                "Product 5",
                24.99,
                "This is a short description of product 5",
                "Detailed detailed description of product 5. It provides more information about the features and benefits of the product.",
                R.drawable.product5
            ),
            Product(
                6,
                "Product 6",
                49.99,
                "This is a short description of product 6",
                "Detailed detailed description of product 6. It provides more information about the features and benefits of the product.",
                R.drawable.product6
            ),
            Product(
                7,
                "Product 7",
                9.99,
                "This is a short description of product 7",
                "Detailed detailed description of product 7. It provides more information about the features and benefits of the product.",
                R.drawable.product7
            ),
            Product(
                8,
                "Product 8",
                15.99,
                "This is a short description of product 8",
                "Detailed detailed description of product 8. It provides more information about the features and benefits of the product.",
                R.drawable.product8
            ),
            Product(
                9,
                "Product 9",
                22.99,
                "This is a short description of product 9",
                "Detailed detailed description of product 9. It provides more information about the features and benefits of the product.",
                R.drawable.product9
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ProductAdapter(
            productList.toMutableList(),
            onItemClick = { product ->
                val action = ProductListFragmentDirections
                    .actionProductListFragmentToProductDetailFragment(product)
                findNavController().navigate(action)
            },
            onDeleteClick = { deletedProduct ->
                Toast.makeText(requireContext(), "${deletedProduct.name} deleted", Toast.LENGTH_SHORT).show()
            }
        )


        return view
    }
}
