package com.ronilsonalves.movieservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Please, don't forget the movie name")
    private String name;

    @NotBlank(message = "Please, insert a valid Genre")
    private String genre;

    @URL(message = "Please, insert a valid URL")
    private String urlStream;
}
