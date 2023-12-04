package com.nirvana.service.impl;

import com.nirvana.dao.TestRepository;
import com.nirvana.entities.TestEntity;
import com.nirvana.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public void testSave(TestEntity testEntity) {
        testRepository.save(testEntity);
    }

    @Override
    public List<TestEntity> testFind() {
        return testRepository.findAll();
    }
}
