package com.imroatusholihah.finaltasksemester1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    private lateinit var conversation: ImageView
    private lateinit var listening: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        conversation = findViewById(R.id.imgConverse)
        conversation.setOnClickListener{
            startActivity(Intent(this, Conversation::class.java))
        }

        listening = findViewById(R.id.imgListening)
        listening.setOnClickListener {
            startActivity(Intent(this, Listening::class.java))
            toast("Listening Here")
        }

    }
}
