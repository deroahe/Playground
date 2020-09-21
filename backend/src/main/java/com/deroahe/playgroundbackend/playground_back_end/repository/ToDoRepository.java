package com.deroahe.playgroundbackend.playground_back_end.repository;

import com.deroahe.playgroundbackend.playground_back_end.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}
