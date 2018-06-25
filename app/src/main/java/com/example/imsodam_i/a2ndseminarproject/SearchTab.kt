package com.example.imsodam_i.a2ndseminarproject

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SearchTab : Fragment() {
    // 돋보기 화면이네용
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v= inflater.inflate(R.layout.fragment_search,container,false)
        return v
    }
}