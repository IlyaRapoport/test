package com.example.test.service;

import com.example.test.model.Test;
import com.example.test.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private
    TestRepository testRepository;

    @Override
    public List<Test> findAll() {
        Test test = new Test();
        List<Test> all = testRepository.findAll();

        if (all.isEmpty()) {
            test.setNumber(1);
        } else {
            test = testRepository.findAll().get(0);
            test.setNumber(test.getNumber() + 1);
        }
        testRepository.save(test);

        return testRepository.findAll();
    }
}
