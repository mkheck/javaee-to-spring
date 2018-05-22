package com.kotlinexample.springkotlinangular

import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/resources/persons")
class PersonController(private val repo: PersonRepository) {

    @GetMapping
    fun listPersons(
            @RequestParam page: Int,
            @RequestParam sortFields: String,
            @RequestParam sortDirections: String) : PaginatedListWrapper {

        val pageRequest = PageRequest.of(page - 1, 10)

        return PaginatedListWrapper(page,
                10,
                repo.count().toInt(),
                sortFields,
                sortDirections,
                repo.findAll(pageRequest).toList())
    }

    @GetMapping("/{id}")
    fun getPerson(@PathVariable id: Long) = repo.findById(id)

    @PostMapping
    fun savePerson(@RequestBody person: Person) = repo.save(person)

    @DeleteMapping("/{id}")
    fun deletePerson(@PathVariable id: Long) = repo.deleteById(id)
}
