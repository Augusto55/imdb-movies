package com.api.crud_imdb;

import com.api.crud_imdb.Movie;
import com.api.crud_imdb.MovieRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void saveMovie(Movie user) {
        movieRepository.save(user);
    }

    public Movie getMovie(Integer id) {
        return movieRepository.findById(id).get();
    }

    public void deleteMovie(Integer id) {
        movieRepository.deleteById(id);
    }

}