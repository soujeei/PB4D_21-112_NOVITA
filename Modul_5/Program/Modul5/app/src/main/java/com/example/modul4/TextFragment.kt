package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class TextFragment : Fragment() {
    internal var view: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(R.layout.fragment_text, container, false)

        val button = view?.findViewById<Button>(R.id.buttonkembali)
        button?.setOnClickListener {
            navigateToFirstFragment()
        }
        return view
    }

    private fun navigateToFirstFragment() {
        parentFragmentManager.popBackStack()
    }
}