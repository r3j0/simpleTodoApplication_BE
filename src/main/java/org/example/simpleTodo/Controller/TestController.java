package org.example.simpleTodo.Controller;

import org.example.simpleTodo.Entity.Test;
import org.example.simpleTodo.Service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<Test> getAllTodos() {
        return testService.findAll();
    }

    @PostMapping
    public Test createTodo(@RequestBody Test test) {
        return testService.save(test);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        testService.delete(id);
    }
}