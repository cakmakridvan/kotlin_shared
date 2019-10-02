package com.company.sharedapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_result.setText("Sonuc: " + 5.faktoriyelBul())
    }

    fun Int.faktoriyelBul() : Int{

        var sonuc = 1

        for (i in  1..this)
            sonuc = sonuc * i

        return sonuc
    }
}
