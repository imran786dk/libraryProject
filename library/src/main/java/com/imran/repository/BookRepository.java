package com.imran.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.imran.domain.Book;

@RepositoryRestResource(path = "books", collectionResourceRel = "books" )
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

}
