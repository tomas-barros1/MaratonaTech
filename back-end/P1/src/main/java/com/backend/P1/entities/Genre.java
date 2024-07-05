package com.backend.P1.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToMany(mappedBy = "genre")
    private Set<Movie> movies;

}
