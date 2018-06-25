package com.example.imsodam_i.a2ndseminarproject

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.app.Activity


class ThirdFragment : Fragment() {
    // Instagram Fragment 3rd
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v= inflater.inflate(R.layout.third_fragment,container,false)
        return v
    }
}