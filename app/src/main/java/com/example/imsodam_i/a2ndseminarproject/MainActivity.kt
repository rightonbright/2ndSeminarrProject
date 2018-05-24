package com.example.imsodam_i.a2ndseminarproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_mine.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when(v){
            main_btn_home -> {
                clearSelected()
                main_btn_home.isSelected = true
                replaceFragment(HomeTab())
            }
            btn_main_search -> {
                clearSelected()
                btn_main_search.isSelected = true
                replaceFragment(SearchTab())
            }
            main_btn_add -> {
                clearSelected()
                main_btn_add.isSelected = true
                val intent = Intent(applicationContext, AddActivity::class.java)
                intent.putExtra("add_image", R.drawable.add_image)
                startActivity(intent)
            }
            btn_main_news -> {
                clearSelected()
                btn_main_news.isSelected = true
                replaceFragment(NewsTab())
            }
            main_btn_mine -> {
                clearSelected()
                main_btn_mine.isSelected = true
                replaceFragment(MineTab())
            }
            mine_btn_list -> {
                clearSelected()
                main_btn_mine.isSelected = true
                replaceFragment(MineTab())
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(HomeTab())
        // = addFragment(new HomeTab())
        main_btn_home.isSelected = true

        // 피드 뷰
        main_btn_home.setOnClickListener(this)
        // 개인 인스타그램 뷰
        main_btn_mine.setOnClickListener(this)
        // 사진 업로드 뷰
        main_btn_add.setOnClickListener(this)
        // 화면 추가 2018. 04. 07
        btn_main_search.setOnClickListener(this)
        btn_main_news.setOnClickListener(this)

        val mine_btn_list = findViewById(R.id.mine_tab_list) as ImageView
        mine_btn_list.setOnClickListener(this)
    }

    fun addFragment(fragment : Fragment) {
        //
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.main_frame, fragment)
        transaction.commit()
    }

    fun replaceFragment(fragment: Fragment) {
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.main_frame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }



    // 검정색조 <-> 회색조
    fun clearSelected(){
        main_btn_home.isSelected = false
        main_btn_add.isSelected = false
        main_btn_mine.isSelected = false
        btn_main_search.isSelected = false
        btn_main_news.isSelected = false
        // 나의 페이지 추가 2018. 04. 09
    }

}
