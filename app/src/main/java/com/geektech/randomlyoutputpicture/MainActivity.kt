package com.geektech.randomlyoutputpicture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.geektech.randomlyoutputpicture.databinding.ActivityMainBinding
import java.lang.Math.random


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayList = arrayListOf("https://i.pinimg.com/564x/72/36/a9/7236a90e8ba559f23334285b46d8e304.jpg", "https://i.pinimg.com/originals/74/76/f1/7476f1144b39db3901054768c242612a.jpg", "https://cms.eliza.co.uk/wp-content/uploads/2022/08/SEI_119661720.jpg?w=1024", "https://edited.beautybay.com/wp-content/uploads/2022/03/allnailss._.jpg", "https://images-stylist.s3-eu-west-1.amazonaws.com/app/uploads/2022/02/01125839/glosshouse_218378999_2897603713820695_189681071965687682_n.jpg")
        with(binding){
            btnSubmit.setOnClickListener {
                val image = etUrl.text.toString()
                arrayList.add(image)
                etUrl.setText("")
                imgPic.loadImage(image)
            }
            btnRandom.setOnClickListener {
                imgPic.loadImage(arrayList[(0 until arrayList.size).random()])


            }
        }

    }

}