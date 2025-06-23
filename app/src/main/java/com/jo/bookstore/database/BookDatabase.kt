package com.jo.bookstore.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jo.bookstore.Book

const val DATABASE_NAME = "book-database"

@Database(entities = [Book::class], version = 1)
abstract class BookDatabase : RoomDatabase(){

    abstract fun bookDao() : BookDao
}