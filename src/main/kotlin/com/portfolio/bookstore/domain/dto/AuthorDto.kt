package com.portfolio.bookstore.domain.dto

import com.portfolio.bookstore.domain.entities.Book

data class AuthorDto(
    val id: Long?,
    val name: String,
    val age: Int,
    val description: String,
    val image: String,
    val books: MutableList<Book> = arrayListOf()
) {

}
