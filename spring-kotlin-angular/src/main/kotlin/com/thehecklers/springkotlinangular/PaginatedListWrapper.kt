package com.thehecklers.springkotlinangular

class PaginatedListWrapper(val currentPage: Int,
                           val pageSize: Int,
                           val totalResults: Int,
                           val sortFields: String,
                           val sortDirections: String,
                           val list: List<Person>)
