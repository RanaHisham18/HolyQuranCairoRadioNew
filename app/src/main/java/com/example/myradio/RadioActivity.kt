package com.example.myradio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myradio.databinding.ActivityRadioBinding

class RadioActivity : AppCompatActivity() {
    private lateinit var mediaPlayer : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)
        var radioBinding = ActivityRadioBinding.inflate(layoutInflater)
        setContentView(radioBinding.root)
    }
}