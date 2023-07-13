package com.example.casio

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.casio.databinding.ActivityMainBinding
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
//        setC
        setContentView(binding.root)

        initUI()
    }
    private fun initUI()
    {
        binding.fabBack.setOnClickListener()
        {
            Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_SHORT).show()
        }
        binding.btnSignIn.setOnClickListener()
        {
            Toast.makeText(applicationContext, "Singned", Toast.LENGTH_SHORT).show()
        }
        binding.tvForgotPassword.setOnClickListener()
        {
            Toast.makeText(applicationContext, "Make Sure", Toast.LENGTH_SHORT).show()
        }
        binding.tvSignup.setOnClickListener()
        {
            Toast.makeText(applicationContext, "#New_Account", Toast.LENGTH_SHORT).show()
        }





    }
}