package com.ayudantias.eventos.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayudantias.eventos.models.Events;


@Repository
public interface EventsRepository extends CrudRepository<Events, Long> {
    List<Events> findAll();
    Optional<Events> findById(Long id);
}
