package com.example.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var flaga = 0

        findViewById<Button>(R.id.back).setOnClickListener {
            if(flaga==0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyc)
                flaga = 1
            }else{
                if(flaga==1){
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyczczapko)
                    flaga = 2
                }else{
                    if(flaga==2){
                        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pancerfuuuuuuuuuur)
                        flaga=0
                    }
                }
            }
        }
        findViewById<Button>(R.id.next).setOnClickListener {
            if(flaga==0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyc)
                flaga = 1
            }else{
                if(flaga==1){
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyczczapko)
                    flaga = 2
                }else{
                    if(flaga==2){
                        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pancerfuuuuuuuuuur)
                        flaga=0
                    }
                }
            }
        }
    }
}