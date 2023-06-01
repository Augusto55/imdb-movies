package com.api.crud_imdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController // This means that this class is a Controller
@RequestMapping("/movies") // This means URL's start with /demo (after Application path)
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

//    @PostMapping("/")
//    public void add(@RequestBody Movie movie) {
//        movieService.saveMovie(movie);
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity<?> update(@RequestBody Movie movie, @PathVariable String id) {
//        try {
//            Movie existMovie = movieService.getMovie(id);
//            movie.setTconst(id);
//            movieService.saveMovie(movie);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable String id) {
//
//        movieService.deleteMovie(id);
//    }



}
