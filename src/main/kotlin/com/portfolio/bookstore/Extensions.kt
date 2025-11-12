package com.portfolio.bookstore

import com.portfolio.bookstore.domain.dto.AuthorDto
import com.portfolio.bookstore.domain.entities.Author

fun Author.toAuthorDto() = AuthorDto(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image,
    books = this.books
)

fun AuthorDto.toEntity() = Author(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image,
    books = this.books
)
