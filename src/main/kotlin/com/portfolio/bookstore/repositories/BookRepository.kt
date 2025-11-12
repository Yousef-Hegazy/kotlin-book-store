package com.portfolio.bookstore.repositories

import com.portfolio.bookstore.domain.entities.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, String> {
}