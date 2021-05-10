package com.example.shittyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shittyapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name:String? = null
    private var fact:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs,0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        fact = intent.getStringExtra(FactAdapter.FACT_EXTRAs)
        setUpFactDetail()

    }
    private fun setUpFactDetail(){
        binding?.detailFacts?.text = fact
        binding?.logoImage?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }



}