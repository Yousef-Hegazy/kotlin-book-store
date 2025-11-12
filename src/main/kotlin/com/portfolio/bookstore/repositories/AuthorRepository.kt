package com.portfolio.bookstore.repositories

import com.portfolio.bookstore.domain.entities.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository : JpaRepository<Author, Long> {
}