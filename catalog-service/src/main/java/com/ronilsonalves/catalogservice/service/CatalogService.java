package com.ronilsonalves.catalogservice.service;

import com.ronilsonalves.catalogservice.dto.GenreDTO;

import java.util.List;

public interface CatalogService {

    GenreDTO findAllMoviesByGenre(String string);
}
