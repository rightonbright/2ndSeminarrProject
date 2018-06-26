package com.example.imsodam_i.a2ndseminarproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_save.*

class SaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var image : Int = 0


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)
        image = intent.getIntExtra("save_image", 0 )
        save_image.setImageResource(image)
    }
}
