package com.example.jdk20demo.repository;

import com.example.jdk20demo.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}

