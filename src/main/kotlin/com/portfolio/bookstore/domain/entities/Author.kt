package com.portfolio.bookstore.domain.entities

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "authors")
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val name: String,
    val age: Int,
    val description: String,
    val image: String,

    @OneToMany(mappedBy = "author", cascade = [(CascadeType.ALL)])
    val books: MutableList<Book> = arrayListOf()
) {
}