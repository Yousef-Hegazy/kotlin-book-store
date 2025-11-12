package com.portfolio.bookstore.controllers

import com.portfolio.bookstore.domain.dto.AuthorDto
import com.portfolio.bookstore.services.AuthorService
import com.portfolio.bookstore.toAuthorDto
import com.portfolio.bookstore.toEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/authors")
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping
    fun createAuthor(@RequestBody dto: AuthorDto): ResponseEntity<AuthorDto> {
        return ResponseEntity.ok(
            authorService.save(dto.toEntity())
                .toAuthorDto()
        );
    }
}