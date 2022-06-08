package com.ronilsonalves.movieservice.controller;

import com.ronilsonalves.movieservice.model.Movie;
import com.ronilsonalves.movieservice.service.MovieServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/movie")
public class MovieController {

    private MovieServiceImpl movieService;

    public MovieController (MovieServiceImpl movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{genre}")
    public ResponseEntity<?> getMoviesByGenre(@PathVariable String genre) {
        return ResponseEntity.status(HttpStatus.OK).body(movieService.findAllMoviesByGenre(genre));
    }


    @PostMapping
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.save(movie));
    }
}
