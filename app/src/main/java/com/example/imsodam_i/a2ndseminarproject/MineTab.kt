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

        v.mine_tab_feed.setOnClickListener(this)
        v.mine_tab_list.setOnClickListener(this)
        v.mine_tab_tag.setOnClickListener(this)
        v.mine_tab_bookmark.setOnClickListener(this)

        return v
    }

    override fun onClick(v: View?) {
        when(v) {
            mine_tab_feed -> {
                clearSelected()
                mine_tab_feed.isSelected = true
            }
            mine_tab_list -> {
                clearSelected()
                mine_tab_list.isSelected = true
                replaceFragment(NewsTab())
                // Toast.makeText(activity!!.applicationContext, "Click Success", Toast.LENGTH_SHORT).show()
            }
            mine_tab_tag -> {
                clearSelected()
                mine_tab_tag.isSelected = true
                replaceFragment(SearchTab())
            }
            mine_tab_bookmark -> {
                clearSelected()
                mine_tab_bookmark.isSelected = true
                val intent = Intent(activity!!.applicationContext, AddActivity::class.java)
                intent.putExtra("add_image", R.drawable.add_image)
            }
        }

    }

    fun replaceFragment(fragment: Fragment) {
        val fm = activity!!.supportFragmentManager
        val transaction = fm.beginTransaction()

        transaction.replace(R.id.mine_fragment, fragment)
        transaction.commit()
    }

    fun clearSelected(){
        mine_tab_feed.isSelected = false
        mine_tab_list.isSelected = false
        mine_tab_tag.isSelected = false
        mine_tab_bookmark.isSelected = false
    }
}