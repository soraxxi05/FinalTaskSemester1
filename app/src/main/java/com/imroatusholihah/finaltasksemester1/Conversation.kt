package com.imroatusholihah.finaltasksemester1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_conversation.*
import kotlinx.android.synthetic.main.activity_listening.*
import android.R.layout.simple_list_item_1
import android.content.Intent
import org.jetbrains.anko.toast

class Conversation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversation)

        //data yg akan ditampilkan ke dalam list view
        val converse = listOf("Mini Market", "SPBU", "Air port", "School", "Office", "Memuji")

        //memberikan adapter ke listView
        list_converse.adapter = ArrayAdapter(this, simple_list_item_1, converse)
        list_converse.setOnItemClickListener { parent, view, position, id ->
            startActivity(Intent(this, DetailConversation::class.java))
        }

    }
}
