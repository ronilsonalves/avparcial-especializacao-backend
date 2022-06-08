package com.ronilsonalves.catalogservice.controller;

import com.ronilsonalves.catalogservice.service.CatalogServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private CatalogServiceImpl catalogService;

    public CatalogController (CatalogServiceImpl catalogService) {
        this.catalogService = catalogService;
    }


    @GetMapping("/movie/{genre}")
    public ResponseEntity<?> getAllMoviesOnCatalogByGenre(@PathVariable String genre) {
        return ResponseEntity.status(HttpStatus.OK).body(catalogService.findAllMoviesByGenre(genre));
    }
}
