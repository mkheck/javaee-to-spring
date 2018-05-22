package com.kotlinexample.springkotlinangular

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class DataInspector(private val repo: PersonRepository) {
    /*
        This component is completely optional, it just provides a bit of visibility into the database
     */
    @PostConstruct
    fun view() {
        repo.findAll().forEach { println(it) }
    }
}