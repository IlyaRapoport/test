package com.example.test.repositories;

import com.example.test.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test> findAll();
}
