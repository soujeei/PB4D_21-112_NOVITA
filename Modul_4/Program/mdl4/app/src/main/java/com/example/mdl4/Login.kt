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


class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etUsername = view.findViewById<EditText>(R.id.username)
        val etPassword = view.findViewById<EditText>(R.id.password)
        val btnLogin = view.findViewById<Button>(R.id.loginbutton)

        btnLogin.setOnClickListener {
            if (etUsername.text.toString().contains("nobita") && etPassword.text.toString().contains("nob00")){
                Toast.makeText(context, "Login Berhasil",Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id. action_login_to_home2)
            }else{
                Toast.makeText(context,"Username atau password salah",Toast.LENGTH_SHORT).show()
            }
        }
    }
}