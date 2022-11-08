package com.example.stalker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.example.stalker.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var pro = 45.5

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.progressBar1?.progress = pro.toInt();
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}