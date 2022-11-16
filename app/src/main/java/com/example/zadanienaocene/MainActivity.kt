package com.example.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun silnia(x: Int) : Int {
            if (x >= 1)
            {
                return x * silnia(x - 1)
            }

            return 1
        }


        var flaga = 1
        var liczba = 0

        findViewById<Button>(R.id.back).setOnClickListener {
            if(flaga==1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyc)
                flaga = 2
            }else{
                if(flaga==2){
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyczczapko)
                    flaga = 3
                }else{
                    if(flaga==3){
                        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pancerfuuuuuuuuuur)
                        flaga=1
                    }
                }
            }
        }
        findViewById<Button>(R.id.next).setOnClickListener {
            if(flaga==1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyc)
                flaga = 2
            }else{
                if(flaga==2){
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.katjuszyczczapko)
                    flaga = 3
                }else{
                    if(flaga==3){
                        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.pancerfuuuuuuuuuur)
                        flaga=1
                    }
                }
            }
        }
        findViewById<Button>(R.id.DodawanieSilni).setOnClickListener {
            if(liczba<10){
                liczba += 1
                findViewById<TextView>(R.id.liczbasilni).text = liczba.toString()
            }
        }
        findViewById<Button>(R.id.OdejmowanieSilni).setOnClickListener {
            if(liczba>0){
                liczba -= 1
                findViewById<TextView>(R.id.liczbasilni).text = liczba.toString()
            }
        }
        findViewById<Button>(R.id.buttonlsilnia).setOnClickListener {
            findViewById<TextView>(R.id.wynik).text = silnia(liczba).toString()
        }
    }
}