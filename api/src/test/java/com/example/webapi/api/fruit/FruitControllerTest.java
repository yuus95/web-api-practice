package com.example.webapi.api.fruit;

import jdk.jfr.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * todo WebMvc CRUD 테스트 코드 구현 하기
 */

@WebMvcTest(FruitController.class)
class FruitControllerTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    @DisplayName("등록 요청에 정상적으로 요청이 들어왔을 경우")
    void registerByValidParameter() throws Exception {
        FruitUpdateReqeustDto fruitUpdateReqeustDto = new FruitUpdateReqeustDto("사과", "빨강");
        String json = """
                {
                "name": "%s",
                "color": "%s"
                }
                """.formatted(fruitUpdateReqeustDto.getName(), fruitUpdateReqeustDto.getColor());

        mockMvc.perform(post("/fruit")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isCreated());
    }

    @Test
    @DisplayName("필드가 하나도 없을 경우 에러 응답")
    void registerByInvalidParameter() throws Exception {
        FruitUpdateReqeustDto fruitUpdateReqeustDto = new FruitUpdateReqeustDto("사과", "");
        String json = """
                {
                "name": "%s",
                "color": "%s"
                }
                """.formatted(fruitUpdateReqeustDto.getName(), fruitUpdateReqeustDto.getColor());

        mockMvc.perform(post("/fruit")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isBadRequest());
    }


}
