package org.example.simpleTodo.Service;

import org.example.simpleTodo.Entity.Test;
import org.example.simpleTodo.Repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<Test> findAll() {
        return testRepository.findAll();
    }

    public Test save(Test test) {
        return testRepository.save(test);
    }

    public void delete(Long id) {
        testRepository.deleteById(id);
    }
}
