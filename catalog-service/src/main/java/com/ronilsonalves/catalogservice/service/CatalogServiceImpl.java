package com.ronilsonalves.catalogservice.service;

import com.ronilsonalves.catalogservice.dto.GenreDTO;
import com.ronilsonalves.catalogservice.dto.MovieDTO;
import com.ronilsonalves.catalogservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    private MovieRepository movieRepository;

    public CatalogServiceImpl (MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public GenreDTO findAllMoviesByGenre(String genre) {
        List<MovieDTO> movies = movieRepository.findMoviesByGenre(genre);
        return new GenreDTO(genre,movies);
    }
}
