package com.example.myradio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}