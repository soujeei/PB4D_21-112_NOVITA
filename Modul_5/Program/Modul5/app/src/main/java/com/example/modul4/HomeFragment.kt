package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val detailButton = view.findViewById<Button>(R.id.button2)
        detailButton.setOnClickListener {
            val detailFragment = TextFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, detailFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return view
    }
}


