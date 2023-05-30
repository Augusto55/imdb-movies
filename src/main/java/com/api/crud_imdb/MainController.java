package com.api.crud_imdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller// This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewMovie (@RequestParam String tconst,
                                             @RequestParam String titleType,
                                             @RequestParam String primaryTitle,
                                             @RequestParam String originalTitle,
                                             @RequestParam Integer isAdult,
                                             @RequestParam Integer startYear,
                                             @RequestParam Integer endYear,
                                             @RequestParam Integer runtimeMinutes,
                                             @RequestParam String genres){

        Movie movie = new Movie();
        movie.setTitleType(titleType);
        movie.setPrimaryTitle(primaryTitle);
        movie.setOriginalTitle(originalTitle);
        movie.setIsAdult(isAdult);
        movie.setStartYear(startYear);
        movie.setEndYear(endYear);
        movie.setRuntimeMinutes(runtimeMinutes);
        movie.setGenres(genres);
        return "Movie added";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
