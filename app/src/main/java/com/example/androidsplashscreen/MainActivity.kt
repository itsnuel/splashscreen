package com.example.androidsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
        )

        val zalego: ImageView = findViewById(R.id.img)
        val text: TextView = findViewById(R.id.motto)

        val imgAnimation = AnimationUtils.loadAnimation(this, R.anim.image_animation)
        val mottoAnimation = AnimationUtils.loadAnimation(this, R.anim.motto_animation)

        zalego.startAnimation(imgAnimation)
        text.startAnimation(mottoAnimation)

        Handler().postDelayed({
            val intent= Intent(this@MainActivity, test::class.java)
            startActivity(intent)
            finish()
        },3000)



    }
}