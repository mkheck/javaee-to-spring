package com.kotlinexample.springkotlinangular

import javax.persistence.*

@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
    @SequenceGenerator(name = "id", sequenceName = "id")
    val id: Long? = null,
    val name: String? = null,
    val description: String? = null,
    val imageurl: String? = null)