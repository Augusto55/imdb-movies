package com.api.crud_imdb.domains;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository  extends CrudRepository<Movie, String> {
    @Query("SELECT m.tconst FROM Movie m ORDER BY m.tconst DESC LIMIT 1")
    String findLatestTconst();

}
