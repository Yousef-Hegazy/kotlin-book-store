package com.portfolio.bookstore.repositories

import com.portfolio.bookstore.domain.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository : JpaRepository<Author, Long> {
}