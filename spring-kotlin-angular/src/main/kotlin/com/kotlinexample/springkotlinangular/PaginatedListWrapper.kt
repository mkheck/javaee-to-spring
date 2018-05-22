package com.kotlinexample.springkotlinangular

class PaginatedListWrapper(
    val currentPage: Int? = 1,
    val pageSize: Int? = 10,
    val totalResults: Int? = 10,
    val sortFields: String? = "id",
    val sortDirections: String? = "asc",
    val list: List<Person>? = null)