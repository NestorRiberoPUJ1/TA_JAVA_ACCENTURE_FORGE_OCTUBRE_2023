package com.ayudantias.eventos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ayudantias.eventos.models.Events;
import com.ayudantias.eventos.repositories.EventsRepository;

@Service
public class EventsServices {

    private final EventsRepository eventsRepository;

    public EventsServices(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    public Events createEvents(Events b) {
        return eventsRepository.save(b);
    }

    public List<Events> buscarTodos() {
        return eventsRepository.findAll();
    }

    public Events buscarId(Long id) {
        Optional<Events> optionalEvents = eventsRepository.findById(id);
        if (optionalEvents.isPresent()) {
            return optionalEvents.get();
        } else {
            return null;
        }
    }

}
