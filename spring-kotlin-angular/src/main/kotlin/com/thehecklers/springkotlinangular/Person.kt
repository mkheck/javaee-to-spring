package com.thehecklers.springkotlinangular

import javax.persistence.*

@Entity
data class Person(@Id
                  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id")
                  @SequenceGenerator(name = "id", sequenceName = "id")
                  val id: Long,
                  val name: String,
                  val description: String,
                  val imageurl: String)