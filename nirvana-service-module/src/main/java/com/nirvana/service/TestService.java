package com.nirvana.service;

import com.nirvana.entities.TestEntity;

import java.util.List;

public interface TestService {

    void testSave(TestEntity testEntity);

    List<TestEntity> testFind();
}
