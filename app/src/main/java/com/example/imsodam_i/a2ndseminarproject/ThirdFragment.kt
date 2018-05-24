package com.example.imsodam_i.a2ndseminarproject

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.app.Activity


// public class ThirdFragment extends MineTab implements View.OnClickListener {
class ThirdFragment : Fragment() {
    // Instagram Fragment 3rd
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v= inflater.inflate(R.layout.third_fragment,container,false)

        return v
    }
//
//    override fun onClick(v: View) {
//        when (v.id) {
//            0xA0A0 -> {
//                startFragment(fragmentManager, ThirdFragment::class.java)
//            }
//            0xA0A1 -> {
//                finishFragment()
//            }
//
//            else -> {
//            }
//        }
//    }
//
//    override fun onAttach(activity: Activity?) {
//        super.onAttach(activity)
//        instanceCount++
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        instanceCount--
//    }

}