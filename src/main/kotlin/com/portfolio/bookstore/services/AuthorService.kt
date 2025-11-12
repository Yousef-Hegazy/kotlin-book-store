package com.portfolio.bookstore.services

import com.portfolio.bookstore.domain.entities.Author

interface AuthorService {
    fun save(author: Author): Author
}