package com.example.mdl4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController


class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSubmit = view.findViewById<Button>(R.id.submitbutton)
        btnSubmit.setOnClickListener {
            val contentNama = view.findViewById<EditText>(R.id.inputnama).text.toString()
            val contentNim = view.findViewById<EditText>(R.id.inputnim).text.toString()
            val contentJurusan = view.findViewById<EditText>(R.id.inputjurusan).text.toString()

            if (contentNama.equals("") || contentNim.equals("") || contentJurusan.equals("")){
                Toast.makeText(context,"Mohon isi data terlebih dahulu",Toast.LENGTH_SHORT).show()
            }else{
                val bundle = Bundle()
                bundle.putString("keyNama",contentNama)
                bundle.putString("keyNim",contentNim)
                bundle.putString("keyJurusan",contentJurusan)

                Toast.makeText(context,"Submit Berhasil",Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_home2_to_profile, bundle)

            }
        }
    }}