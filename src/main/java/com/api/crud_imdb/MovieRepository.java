package com.api.crud_imdb;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository  extends CrudRepository<Movie, String> {
}
