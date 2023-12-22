package com.ayudantias.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ayudantias.lookify.models.Song;
import com.ayudantias.lookify.repositories.SongRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SongService {

    public final SongRepository songRepository;

    // Devolviendo todos las canciones.
    public List<Song> allSongs() {
        return songRepository.findAll();
    }

    // Creando una cancion.
    public Song createSong(Song b) {
        return songRepository.save(b);
    }

    // Actualizando una cancion.
    public Song updateSong(Song b) {
        return songRepository.save(b);
    }

    // Obteniendo la información de una cancion
    public Song findSong(Long id) {
        Optional<Song> optionalSong = songRepository.findById(id);
        if (optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }

    // Buscando todas las canciones de un artista
    public List<Song> allSongsByArtist(String artista) {
        return songRepository.findByArtistaLike(artista);
    }
    public List<Song> topSongs(int limit) {
        return songRepository.findAllOrderByClasificacionLimitedTo(limit);
    }

    // Eliminar una cancion.
    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

}
