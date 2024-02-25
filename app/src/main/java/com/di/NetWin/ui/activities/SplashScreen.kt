package com.di.NetWin.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.di.NetWin.R

class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2500 // 1.5 seconds
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val imageView = findViewById<ImageView>(R.id.imageView2)
//        imageView.alpha = 0f
//
//        // Use AlphaAnimation for fade-in effect
//        val fadeIn = AlphaAnimation(0f, 1f)
//        fadeIn.duration = 1000 // 1 second
//        fadeIn.fillAfter = true // Keep the final state after animation
//
//        // Start the fade-in animation
//        imageView.startAnimation(fadeIn)

        // Use a Handler to delay the transition to the next activity
        Handler().postDelayed({
            // This code will be executed after the splash time has elapsed
            val intent = Intent(this, FirstActivity::class.java) // Replace NextActivity with your desired activity
            startActivity(intent)
            finish() // close this activity to prevent the user from coming back to the splash screen using the back button
        }, SPLASH_TIME_OUT)
    }
}
