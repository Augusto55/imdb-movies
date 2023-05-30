package com.api.crud_imdb;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository  extends CrudRepository<Movie, Integer> {
}
