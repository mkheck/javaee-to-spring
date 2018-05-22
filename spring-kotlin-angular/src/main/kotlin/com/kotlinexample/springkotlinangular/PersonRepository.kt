package com.kotlinexample.springkotlinangular

import org.springframework.data.repository.PagingAndSortingRepository

interface PersonRepository : PagingAndSortingRepository<Person, Long>