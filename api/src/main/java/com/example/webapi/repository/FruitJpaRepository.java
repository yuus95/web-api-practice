package com.example.webapi.repository;

import com.example.webapi.Entitiy.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface FruitJpaRepository extends JpaRepository<Fruit, Long> {

    Fruit save(Fruit fruit);
}
