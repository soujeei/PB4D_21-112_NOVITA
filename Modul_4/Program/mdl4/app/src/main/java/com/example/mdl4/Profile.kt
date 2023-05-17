package com.example.mdl4


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import org.w3c.dom.Text


class Profile : Fragment() {

    lateinit var contentNama: String
    lateinit var contentNim: String
    lateinit var  contentJurusan: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contentNama = arguments?.getString("keyNama").toString()
        contentNim = arguments?.getString("keyNim").toString()
        contentJurusan = arguments?.getString("keyJurusan").toString()

        val tNama = view.findViewById<TextView>(R.id.textNama)
        val tNim = view.findViewById<TextView>(R.id.textNIM)
        val tJurusan = view.findViewById<TextView>(R.id.textJurusan)
        val btnBack = view.findViewById<Button>(R.id.backbutton)

        tNama.text = "$contentNama"
        tNim.text = "$contentNim"
        tJurusan.text = "$contentJurusan"

        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_profile_to_home2)
        }
    }}