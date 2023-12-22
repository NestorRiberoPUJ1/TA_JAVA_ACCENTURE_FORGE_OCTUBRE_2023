package com.ayudantias.lookify.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.ayudantias.lookify.models.Song;
import com.ayudantias.lookify.services.SongService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class SongController {

    public final SongService songService;

    @GetMapping("/")
    public String root() {
        return "index.jsp";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model,
            @RequestParam(value = "artist", required = false) String artist,
            @RequestParam(value = "top", required = false) Integer top) {

        List<Song> songs;
        if (artist != null) {
            songs = songService.allSongsByArtist(artist);
        }
        else if (top != null) {
            songs = songService.topSongs(3);
        }
        else {
            songs = songService.allSongs();
        }

        model.addAttribute("songs", songs);
        return "dashboard.jsp";
    }

    @GetMapping("/search/{artist}")
    public String search(@PathVariable("artist") String artist) {
        return "search.jsp";
    }

    @GetMapping("/topten")
    public String topten() {
        return "top.jsp";
    }

    @GetMapping("/song/{id}")
    public String viewSong(@PathVariable("id") Long id) {
        return "song.jsp";
    }

    @GetMapping("/song/new")
    public String createSong(@Valid @ModelAttribute("song") Song song,
            BindingResult result) {
        return "newSong.jsp";
    }

    @PostMapping("/song")
    public String createNewSong(@Valid @ModelAttribute("song") Song song,
            BindingResult result) {
        if (result.hasErrors()) {
            return "newSong.jsp";
        } else {
            songService.createSong(song);
        }

        return "redirect:/dashboard";
    }

    @DeleteMapping("/song/{id}")
    public String deleteSong(@PathVariable("id") Long id) {
        songService.deleteSong(id);
        return "redirect:/dashboard";
    }

}
