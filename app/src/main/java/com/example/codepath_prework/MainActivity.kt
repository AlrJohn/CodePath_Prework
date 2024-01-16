package com.example.codepath_prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var displayToast = "Hi to you too!"

        var greet = findViewById<Button>(R.id.sayHi)

        greet.setOnClickListener{

            Toast.makeText(this, displayToast, Toast.LENGTH_LONG).show()

        }

        var displayText = findViewById<TextView>(R.id.Hello)

        var textSpanish = getText(R.string.Intro_text_SP)
        var textEnglish = getText(R.string.Intro_text_EN)

        var changeLang = findViewById<Button>(R.id.language)
        
        changeLang.setOnClickListener{
            if (changeLang.text.equals("Spanish")){
                displayText.text = textSpanish
                changeLang.text = "English"
                greet.text = "Di Hola!"
                displayToast = "Hola a ti tambien!"

            }
            else if (changeLang.text.equals("English")) {
                displayText.text = textEnglish
                changeLang.text = "Spanish"
                greet.text = "Say Hi!"
                displayToast = "Hi to you yoo!"
            }
        }

    }



}




