package com.api.crud_imdb;

import com.api.crud_imdb.Movie;
import com.api.crud_imdb.MovieRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Iterable<Movie> listAllMovies() {
        return movieRepository.findAll();
    }

//    public void saveMovie(Movie user) {
//        movieRepository.save(user);
//    }
//
    public Movie getMovie(String id) {
        return movieRepository.findById(id).get();
    }
//
//    public void deleteMovie(String id) {
//        movieRepository.deleteById(id);
//    }

}