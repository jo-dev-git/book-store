package com.jo.bookstore.bookslist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.jo.bookstore.App
import com.jo.bookstore.Book

class BooksListViewModel() : ViewModel() {

    val books:LiveData<List<Book>> = App.db.bookDao().getAllBooks()
}