package org.example.simpleTodo.Repository;

import  org.example.simpleTodo.Entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}