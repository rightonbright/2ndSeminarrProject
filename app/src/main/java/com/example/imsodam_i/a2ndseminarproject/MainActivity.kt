package com.example.imsodam_i.a2ndseminarproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when(v){
            main_btn_home -> {
                // 홈 화면 이동
                clearSelected()
                main_btn_home.isSelected = true
                replaceFragment(HomeTab())
            }
            btn_main_search -> {
                // 돋보기 화면 이동
                clearSelected()
                btn_main_search.isSelected = true
                replaceFragment(SearchTab())
            }
            main_btn_add -> {
                // '+' 이미지 이동
                clearSelected()
                main_btn_add.isSelected = true
                val intent = Intent(applicationContext, AddActivity::class.java)
                intent.putExtra("add_image", R.drawable.add_image)
                startActivity(intent)
            }
            btn_main_news -> {
                // 좋아요 화면 이동
                clearSelected()
                btn_main_news.isSelected = true
                replaceFragment(NewsTab())
            }
            main_btn_mine -> {
                // 마이 페이지 화면 이동
                clearSelected()
                main_btn_mine.isSelected = true
                replaceFragment(MineTab())
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(HomeTab())                      // fragment 추가
        main_btn_home.isSelected = true             // 아이콘 검정색조 상태

        main_btn_home.setOnClickListener(this)      // 메인 화면
        main_btn_mine.setOnClickListener(this)      // 마이 페이지 화면
        main_btn_add.setOnClickListener(this)       // '+'
        btn_main_search.setOnClickListener(this)    // 돋보기 화면
        btn_main_news.setOnClickListener(this)      // 좋아요 화면
    }

    fun addFragment(fragment : Fragment) {
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
    }

}
