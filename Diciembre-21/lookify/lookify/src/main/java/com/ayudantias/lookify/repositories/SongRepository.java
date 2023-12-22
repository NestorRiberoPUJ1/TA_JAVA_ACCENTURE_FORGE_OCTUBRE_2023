package com.ayudantias.lookify.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ayudantias.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> findAll();

    Optional<Song> findById(Long id);

    List<Song> findByArtistaLike(String artista);

    List<Song> findOrderByClasificacion(Limit);

}
