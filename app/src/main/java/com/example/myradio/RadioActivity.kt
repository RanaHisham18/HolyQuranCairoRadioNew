package com.example.myradio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myradio.databinding.ActivityRadioBinding

class RadioActivity : AppCompatActivity() {
    private lateinit var mediaPlayer : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)
        var binding = ActivityRadioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.playBtn.setOnClickListener {
            var audioUrl = "http://n04.radiojar.com/8s5u5tpdtwzuv?rj-ttl=5&amp;rj-tok=AAABhq2_320AV5bkOc8rBmvI_A"
            mediaPlayer.setDataSource(audioUrl)
            mediaPlayer.prepare()
            mediaPlayer.start()
            Toast.makeText(applicationContext, "Audio started playing..", Toast.LENGTH_SHORT).show()
            binding.btnIcon.setBackgroundResource(R.drawable.baseline_motion_photos_paused_24)

        }
        if (mediaPlayer.isPlaying){
            binding.playBtn.setOnClickListener {
                mediaPlayer.stop()
                binding.btnIcon.setBackgroundResource(R.drawable.baseline_play_arrow_24)
            }
        }
    }
}