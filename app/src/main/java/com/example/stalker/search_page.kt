package com.example.stalker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.stalker.databinding.ActivitySearchPageBinding

class search_page : AppCompatActivity() {

    private var binding : ActivitySearchPageBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchPageBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        binding?.btnstart?.setOnClickListener {
            val Username = binding?.etName?.text
            if (Username!!.isNotEmpty()){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                Username.clear()
            }
            else{
                Toast.makeText(this,"USERNAME is Empty",Toast.LENGTH_SHORT).show()
            }

        }

    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

    fun getstring(str : String) : Boolean{
        return str.isNotEmpty()
    }

}