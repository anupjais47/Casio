package com.example.casio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class CasioSplash : AppCompatActivity() {
    private val SPLASH_TIME = 1700L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_casio_splash)

        /*new Handler(Looper.getMainLooper()).postDelayed(new Runnable(){
            public void run()
            {
                Intent i=new Intent(CasioSplash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }SPLASH_TIME);*/
        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }, SPLASH_TIME)
    }
}