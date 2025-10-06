package org.example.simpleTodo.Repository;

import org.example.simpleTodo.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}