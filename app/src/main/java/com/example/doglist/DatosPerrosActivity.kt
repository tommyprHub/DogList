package com.example.doglist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.doglist.databinding.ActivityDatosPerrosBinding
import com.squareup.picasso.Picasso

class DatosPerrosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatosPerrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatosPerrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageUrl = intent.getStringExtra("image_url")

        Picasso.get().load(imageUrl).into(binding.ivDogDatos)
    }

}