package com.portfolio.bookstore.services.impl

import com.portfolio.bookstore.domain.entities.Author
import com.portfolio.bookstore.repositories.AuthorRepository
import com.portfolio.bookstore.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepo: AuthorRepository) : AuthorService {

    override fun save(author: Author): Author {
        return authorRepo.save(author)
    }
}