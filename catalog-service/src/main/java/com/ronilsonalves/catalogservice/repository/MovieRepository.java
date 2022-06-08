package com.ronilsonalves.catalogservice.repository;

import com.ronilsonalves.catalogservice.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "MOVIE-SERVICE")
public interface MovieRepository {

    @GetMapping("/movie/{genre}")
    List<MovieDTO> findMoviesByGenre(@PathVariable String genre);

}
