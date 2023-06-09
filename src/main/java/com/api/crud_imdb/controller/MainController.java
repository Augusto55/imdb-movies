package com.api.crud_imdb.controller;

import com.api.crud_imdb.domains.Movie;
import com.api.crud_imdb.domains.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movies")
public class MainController {
    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public Iterable<Movie> list(){
        return movieService.listAllMovies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> get(@PathVariable String id) {
        Movie movie = movieService.getMovie(id);
        return new ResponseEntity<Movie>(movie, HttpStatus.OK);
    }

    @PostMapping("/add")
    public void add(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Movie movie, @PathVariable String id) {
        try {
            Movie existMovie = movieService.getMovie(id);
            movie.setTconst(id);
            movieService.saveMovie(movie);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        movieService.deleteMovie(id);
    }



}
