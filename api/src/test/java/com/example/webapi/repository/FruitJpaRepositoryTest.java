package com.example.webapi.repository;

import com.example.webapi.Entitiy.Fruit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class FruitJpaRepositoryTest {

    @Autowired
    FruitJpaRepository fruitJpaRepository;

    @Test
    void save() {
        Fruit fruit = new Fruit("사과", "레드");
        fruitJpaRepository.save(fruit);
    }
}
