package com.jo.bookstore

import android.app.Application
import androidx.room.Room
import com.jo.bookstore.database.BookDatabase
import com.jo.bookstore.database.DATABASE_NAME

class App : Application() {
    companion object {
        lateinit var db: BookDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, BookDatabase::class.java, DATABASE_NAME).build()
    }
}