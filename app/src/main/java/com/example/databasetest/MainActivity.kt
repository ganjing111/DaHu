package com.example.databasetest

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dbHelper = MyDatabaseHelper(this,"BookStore.db",2)
        val createDatabase:Button = findViewById(R.id.createDatabase)
        createDatabase.setOnClickListener{
            dbHelper.writableDatabase

        }

    }
}