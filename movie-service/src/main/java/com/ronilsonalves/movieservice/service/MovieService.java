package com.ronilsonalves.movieservice.service;

import com.ronilsonalves.movieservice.dto.MovieDTO;
import com.ronilsonalves.movieservice.model.Movie;

import java.util.List;

public interface MovieService {

    MovieDTO save(Movie movie);

    List<MovieDTO> findAllMoviesByGenre(String genre);
}
