package com.example.webapi.service;

import com.example.webapi.Entitiy.Fruit;
import com.example.webapi.api.fruit.FruitUpdateReqeustDto;
import com.example.webapi.repository.FruitJpaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FruitServiceTest {
    FruitJpaRepository fruitJpaRepository = Mockito.mock(FruitJpaRepository.class);

    FruitService fruitService = new FruitService(fruitJpaRepository);

    @Test
    void saveFruitByValidParameter() {
        FruitUpdateReqeustDto fruitUpdateReqeustDto = new FruitUpdateReqeustDto("사과", "빨강");

        when(fruitJpaRepository.save(any())).thenReturn(fruitUpdateReqeustDto.toFruit());

        Fruit result = fruitService.save(fruitUpdateReqeustDto);

        assertThat(result.getName()).isEqualTo(fruitUpdateReqeustDto.getName());
        assertThat(result.getColor()).isEqualTo(fruitUpdateReqeustDto.getColor());
    }
}
