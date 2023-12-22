package com.ayudantias.lenguajes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayudantias.lenguajes.models.Lenguaje;

@Repository
public interface LenguajeRepository extends CrudRepository<Lenguaje, Long> {

    List<Lenguaje> findAll();

    Optional<Lenguaje> findById(Long id);

}
