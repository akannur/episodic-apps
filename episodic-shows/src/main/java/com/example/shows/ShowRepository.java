package com.example.shows;

import org.springframework.data.repository.CrudRepository;

public interface ShowRepository extends CrudRepository<Show, Long> {
    Show findById(Long id);
}
