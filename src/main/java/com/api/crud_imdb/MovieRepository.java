package com.api.crud_imdb;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository  extends CrudRepository<Movie, String> {
    @Query("SELECT m.tconst FROM Movie m ORDER BY m.tconst DESC LIMIT 1")
    String findLatestTconst();

}
