package com.example.jdk20demo.controller;

import com.example.jdk20demo.model.Note;
import com.example.jdk20demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note create(@RequestBody Note note) {
        return noteService.create(note);
    }

    @GetMapping
    public List<Note> findAll() {
        return noteService.findAll();
    }

    // Other CRUD endpoints
}

