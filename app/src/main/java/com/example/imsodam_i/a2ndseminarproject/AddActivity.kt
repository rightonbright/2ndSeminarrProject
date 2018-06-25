package com.example.imsodam_i.a2ndseminarproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.imsodam_i.a2ndseminarproject.R.drawable.add_image
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var image : Int = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        image = intent.getIntExtra("add_image", 0 )
        add_image.setImageResource(image)

    }
}
