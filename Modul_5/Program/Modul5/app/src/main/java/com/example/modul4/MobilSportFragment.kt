package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MobilSportFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var mobilSportAdapter: MobilSportAdapter
    private lateinit var CMobilSport: MutableList<CMobilSport>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mobilsport, container, false)

        recyclerView = view.findViewById(R.id.recyclerview)

        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager

        CMobilSport = mutableListOf()
        CMobilSport.add(CMobilSport("Uchiha Itachi",  R.drawable.itachi))
        CMobilSport.add(CMobilSport("MINI 3-DOOR JCW",  R.drawable.n2))
        CMobilSport.add(CMobilSport("BMW M2 COMPETITION", R.drawable.n3))
        CMobilSport.add(CMobilSport("MARCEDES-AMG A 35 4MATIC", R.drawable.n4))
        CMobilSport.add(CMobilSport("HONDA CIVIC TYPE R", R.drawable.n5))
        CMobilSport.add(CMobilSport("BMW M3 COMPETITION",  R.drawable.n6))
        CMobilSport.add(CMobilSport("MERCEDES-AMG CLA 45 S 4MATIC",  R.drawable.n7))
        CMobilSport.add(CMobilSport("MINI COUNTRYMAN JCW", R.drawable.n8))
        CMobilSport.add(CMobilSport("TOYOTA GR SUPRA", R.drawable.n9))
        CMobilSport.add(CMobilSport("BMW M1", R.drawable.n10))
        CMobilSport.add(CMobilSport("BUGATTI",  R.drawable.n11))
        CMobilSport.add(CMobilSport("FERARRI",  R.drawable.n12))
        CMobilSport.add(CMobilSport("PAGANI", R.drawable.n13))
        CMobilSport.add(CMobilSport("CHEVROLET", R.drawable.n14))
        CMobilSport.add(CMobilSport("DOGDE", R.drawable.n15))


        mobilSportAdapter = MobilSportAdapter(CMobilSport)
        recyclerView.adapter = mobilSportAdapter

        return view
    }
}