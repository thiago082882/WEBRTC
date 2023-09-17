package com.thiago.webrtc.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.thiago.webrtc.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
                binding.enterBtn.setOnClickListener {
            if (binding.usernameEt.text.isNullOrEmpty()){
                Toast.makeText(this, "please fill the username", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            startActivity(
                Intent(this,MainActivity::class.java).apply {
                    putExtra("username",binding.usernameEt.text.toString())
                }
            )
        }
    }
}