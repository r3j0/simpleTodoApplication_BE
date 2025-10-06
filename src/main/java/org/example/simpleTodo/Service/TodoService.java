package org.example.simpleTodo.Service;

import org.example.simpleTodo.DTO.TodoUpdateRequest;
import org.example.simpleTodo.Entity.Todo;
import org.example.simpleTodo.Repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Long id, TodoUpdateRequest request) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        if (request.getTitle() != null) {
            todo.setTitle(request.getTitle());
        }

        if (request.getIsCompleted() != null) {
            todo.setCompleted(request.getIsCompleted());
        }

        return todoRepository.save(todo);
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
