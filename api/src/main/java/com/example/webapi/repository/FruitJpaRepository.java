package com.example.webapi.repository;

import com.example.webapi.Entitiy.Fruit;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FruitJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public Fruit save(Fruit fruit) {
        em.persist(fruit);
        return fruit;
    }
}
