package com.imroatusholihah.finaltasksemester1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import org.jetbrains.anko.toast

class DetailConversation : AppCompatActivity() {

    private lateinit var imagePlay : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_conversation)

        imagePlay = findViewById(R.id.buttonPlayConverse)
        imagePlay.setOnClickListener{
            toast("Audio Play Begin")
        }

    }
}
