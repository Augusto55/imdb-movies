package com.api.crud_imdb.domains;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Iterable<Movie> listAllMovies() {
        return movieRepository.findAll();
    }

    public void saveMovie(Movie user) {
        movieRepository.save(user);
    }

    public Movie getMovie(String id) {
        return movieRepository.findById(id).get();
    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }

    public String getLastId(){
        return movieRepository.findLatestTconst();
    }

}