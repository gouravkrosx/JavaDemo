package com.example.jdk20demo.service;

import com.example.jdk20demo.model.Note;
import com.example.jdk20demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note create(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> findAll() {
        List<Note> notes = noteRepository.findAll();
        System.out.println("There are the notes returned by the database: " +  notes.get(1).getTitle());
        return notes;
    }

    // Other CRUD operations
}
