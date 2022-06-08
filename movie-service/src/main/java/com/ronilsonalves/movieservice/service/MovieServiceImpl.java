package com.ronilsonalves.movieservice.service;

import com.ronilsonalves.movieservice.dto.MovieDTO;
import com.ronilsonalves.movieservice.model.Movie;
import com.ronilsonalves.movieservice.repository.MovieRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository movieRepository;

    public MovieServiceImpl (MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieDTO save(Movie movie) {
        MovieDTO movieResponse = new MovieDTO();
        movieRepository.save(movie);
        BeanUtils.copyProperties(movie,movieResponse);
        return movieResponse;
    }

    @Override
    public List<MovieDTO> findAllMoviesByGenre(String genre) {
        return movieRepository.findAllByGenre(genre).stream().map(movie -> {
            MovieDTO movieResponse = new MovieDTO();
            BeanUtils.copyProperties(movie,movieResponse);
            return movieResponse;
        }).collect(Collectors.toList());
    }
}
