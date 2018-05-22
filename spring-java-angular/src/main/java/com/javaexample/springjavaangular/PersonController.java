package com.javaexample.springjavaangular;

import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resources/persons")
public class PersonController {
    private final PersonRepository repo;

    public PersonController(PersonRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public PaginatedListWrapper listPersons(@RequestParam(defaultValue = "1") Integer page,
                                            @RequestParam(defaultValue = "id") String sortFields,
                                            @RequestParam(defaultValue = "asc") String sortDirections) {

        PageRequest request = PageRequest.of(page - 1, 10);

        PaginatedListWrapper paginatedListWrapper = new PaginatedListWrapper();
        paginatedListWrapper.setCurrentPage(page);
        paginatedListWrapper.setSortFields(sortFields);
        paginatedListWrapper.setSortDirections(sortDirections);
        paginatedListWrapper.setPageSize(10);
        paginatedListWrapper.setTotalResults(Math.toIntExact(repo.count()));
        paginatedListWrapper.setList(repo.findAll(request).stream().collect(Collectors.toList()));
        return paginatedListWrapper;
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return repo.save(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
