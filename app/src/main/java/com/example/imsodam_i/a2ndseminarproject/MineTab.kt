package com.example.imsodam_i.a2ndseminarproject

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_mine.*
import kotlinx.android.synthetic.main.fragment_mine.view.*

class MineTab : Fragment(), View.OnClickListener {
    // 마이 페이지
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_mine, container, false)

        addFragment(FeedTab())
        v.mine_tab_all.isSelected = true

        v.mine_tab_all.setOnClickListener(this)
        v.mine_tab_align.setOnClickListener(this)
        v.mine_tab_tag.setOnClickListener(this)
        v.mine_tab_save.setOnClickListener(this)

        return v
    }

    override fun onClick(v: View?) {
        when(v) {
            mine_tab_all -> {
                clearSelected()
                mine_tab_all.isSelected = true
                replaceFragment(FeedTab())
            }
            mine_tab_align -> {
                clearSelected()
                mine_tab_align.isSelected = true
                replaceFragment(NewsTab())
            }
            mine_tab_tag -> {
                clearSelected()
                mine_tab_tag.isSelected = true
                replaceFragment(SearchTab())
            }
            mine_tab_save -> {
                clearSelected()
                mine_tab_save.isSelected = true
                val intent = Intent(activity!!.applicationContext, SaveActivity::class.java)
                intent.putExtra("save_image", R.drawable.my_save_off)
                startActivity(intent)
            }
        }

    }

    fun addFragment(fragment : Fragment) {
        val fm = activity!!.supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.mine_frame, fragment)
        transaction.commit()
    }

    fun replaceFragment(fragment: Fragment) {
        val fm = activity!!.supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.mine_frame, fragment)
        transaction.commit()
    }

    fun clearSelected(){
        mine_tab_all.isSelected = false
        mine_tab_align.isSelected = false
        mine_tab_tag.isSelected = false
        mine_tab_save.isSelected = false
    }
}