package com.example.bolalaruchunalifbo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bolalaruchunalifbo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.relativelayout1.apply {
            setOnClickListener {
                val intent= Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(intent)
            }
        }
        binding.relativelayout2.apply {
            setOnClickListener {
                val intent= Intent(this@MainActivity,MainActivity3::class.java)
                startActivity(intent)
            }
        }
    }
}