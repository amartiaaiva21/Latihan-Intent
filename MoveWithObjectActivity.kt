package com.dicoding.picodiploma.myintentapp

import android.app.Person
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myintentapp.R
import kotlinx.android.synthetic.main.activity_move_with_object.view.*
import org.w3c.dom.Text

class MoveWithObjectActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    overidde fun onCreate(savedlnstanceState:Bundle?) {
        super.onCreate(savedlnstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObject:TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra(EXTRA_PERSON) as Person
        val text = "Name : ${person.name.toString()},\nEmail : ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
        tvObject.text = text
    }
}