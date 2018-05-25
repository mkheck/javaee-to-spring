package com.thehecklers.springkotlinangular

import org.springframework.data.repository.PagingAndSortingRepository

interface PersonRepository : PagingAndSortingRepository<Person, Long>