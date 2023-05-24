package com.example.webapi.service;

import com.example.webapi.Entitiy.Fruit;
import com.example.webapi.api.fruit.FruitUpdateReqeustDto;
import com.example.webapi.repository.FruitJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class FruitService {

    private final FruitJpaRepository fruitJpaRepository;

    public Fruit save(FruitUpdateReqeustDto updateReqeustDto) {
        return fruitJpaRepository.save(updateReqeustDto.toFruit());
    }
}
